package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes.ParentService;

import java.util.Set;

@RestController
@RequestMapping("/Parent")
public class ParentController {
    @Qualifier("ParentServiceImpl")
    private ParentService service;

    @PostMapping("/create")
    @ResponseBody
    public Parent create(Parent student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Parent update(Parent student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Parent read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Parent> getAll() {
        return service.getAll();
    }

}