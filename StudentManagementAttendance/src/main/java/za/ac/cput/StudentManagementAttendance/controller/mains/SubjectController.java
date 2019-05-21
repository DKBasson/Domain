package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.SubjectService;

import java.util.Set;
@RestController
@RequestMapping("/Subject")
public class SubjectController {
    @Qualifier("SubjectServiceImpl")
    private SubjectService service;

    @PostMapping("/create")
    @ResponseBody
    public Subject create(Subject student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Subject update(Subject student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Subject read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Subject> getAll() {
        return service.getAll();
    }

}