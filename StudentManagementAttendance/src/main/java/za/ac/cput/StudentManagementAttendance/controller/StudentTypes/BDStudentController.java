package za.ac.cput.StudentManagementAttendance.controller.StudentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.BDStudentService;

import java.util.Set;

@RestController
@RequestMapping("/BDStudent")
public class BDStudentController {
    @Qualifier("BDStudentServiceImpl")
    private BDStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public BDStudent create(BDStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public BDStudent update(BDStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BDStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BDStudent> getAll() {
        return service.getAll();
    }

}