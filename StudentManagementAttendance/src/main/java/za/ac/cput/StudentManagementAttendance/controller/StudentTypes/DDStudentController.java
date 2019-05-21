package za.ac.cput.StudentManagementAttendance.controller.StudentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.DDStudentService;

import java.util.Set;

@RestController
@RequestMapping("/DDStudent")
public class DDStudentController {
    @Qualifier("DDStudentServiceImpl")
    private DDStudentService service;

    @PostMapping("/create")
    @ResponseBody
    public DDStudent create(DDStudent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public DDStudent update(DDStudent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public DDStudent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<DDStudent> getAll() {
        return service.getAll();
    }

}