package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.LecturerService;

import java.util.Set;
@RestController
@RequestMapping("/lecturer")
public class LecturerController {
    @Qualifier("LecturerServiceImpl")
    private LecturerService service;

    @PostMapping("/create")
    @ResponseBody
    public Lecturer create(Lecturer student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Lecturer update(Lecturer student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Lecturer read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Lecturer> getAll() {
        return service.getAll();
    }

}