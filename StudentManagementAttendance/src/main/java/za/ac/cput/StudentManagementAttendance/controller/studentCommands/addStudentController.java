package za.ac.cput.StudentManagementAttendance.controller.studentCommands;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands.addStudentService;


import java.util.Set;
@RestController
@RequestMapping("/addStudent")
public class addStudentController {
    @Qualifier("addStudentServiceImpl")
    private addStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public addStudent create(addStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public addStudent update(addStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public addStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<addStudent> getAll() {
        return service.getAll();
    }

}