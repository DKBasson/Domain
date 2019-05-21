package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.UniversityService;

import java.util.Set;
@RestController
@RequestMapping("/University")
public class UniversityController {
    @Qualifier("UniversityServiceImpl")
    private UniversityService service;

    @PostMapping("/create")
    @ResponseBody
    public University create(University student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public University update(University student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public University read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<University> getAll() {
        return service.getAll();
    }

}