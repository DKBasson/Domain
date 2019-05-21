package za.ac.cput.StudentManagementAttendance.controller.studentCommands;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands.removeStudentService;


import java.util.Set;
@RestController
@RequestMapping("/removeStudent")
public class removeStudentController {
    @Qualifier("removeStudentServiceImpl")
    private removeStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public removeStudent create(removeStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public removeStudent update(removeStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public removeStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<removeStudent> getAll() {
        return service.getAll();
    }

}