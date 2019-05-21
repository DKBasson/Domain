package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.AttendanceService;

import java.util.Set;
@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @Qualifier("AttendanceServiceImpl")
    private AttendanceService service;

    @PostMapping("/create")
    @ResponseBody
    public Attendance create(Attendance student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Attendance update(Attendance student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Attendance read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Attendance> getAll() {
        return service.getAll();
    }

}