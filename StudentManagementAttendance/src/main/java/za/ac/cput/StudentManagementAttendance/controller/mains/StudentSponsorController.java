package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.StudentSponsorService;

import java.util.Set;
@RestController
@RequestMapping("/StudentSponsor")
public class StudentSponsorController {
    @Qualifier("StudentSponsorServiceImpl")
    private StudentSponsorService service;

    @PostMapping("/create")
    @ResponseBody
    public StudentSponsor create(StudentSponsor student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public StudentSponsor update(StudentSponsor student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StudentSponsor read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StudentSponsor> getAll() {
        return service.getAll();
    }

}