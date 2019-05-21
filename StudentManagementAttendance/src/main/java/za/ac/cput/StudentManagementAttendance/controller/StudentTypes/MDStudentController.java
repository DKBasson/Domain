package za.ac.cput.StudentManagementAttendance.controller.StudentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.MDStudentService;

import java.util.Set;

@RestController
@RequestMapping("/MDStudent")
public class MDStudentController {
    @Qualifier("MDStudentServiceImpl")
    private MDStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public MDStudent create(MDStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public MDStudent update(MDStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MDStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MDStudent> getAll() {
        return service.getAll();
    }

}