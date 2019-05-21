package za.ac.cput.StudentManagementAttendance.controller.StudentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.ADStudentService;

import java.util.Set;

@RestController
@RequestMapping("/ADStudent")
public class ADStudentController {
    @Qualifier("ADStudentServiceImpl")
    private ADStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public ADStudent create(ADStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public ADStudent update(ADStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ADStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ADStudent> getAll() {
        return service.getAll();
    }

}