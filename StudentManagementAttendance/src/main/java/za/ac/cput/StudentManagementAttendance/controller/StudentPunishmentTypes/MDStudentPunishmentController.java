package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.MDStudentPunishmentService;

import java.util.Set;

@RestController
@RequestMapping("/MDStudentPunishment")
public class MDStudentPunishmentController {
    @Qualifier("MDStudentPunishmentServiceImpl")
    private MDStudentPunishmentService service;

    @PostMapping("/create")
    @ResponseBody
    public MDStudentPunishment create(MDStudentPunishment student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public MDStudentPunishment update(MDStudentPunishment student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MDStudentPunishment read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MDStudentPunishment> getAll() {
        return service.getAll();
    }

}