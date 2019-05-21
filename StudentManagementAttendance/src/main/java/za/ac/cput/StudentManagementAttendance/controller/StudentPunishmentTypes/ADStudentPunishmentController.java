package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.ADStudentPunishmentService;

import java.util.Set;

@RestController
@RequestMapping("/ADStudentPunishment")
public class ADStudentPunishmentController {
    @Qualifier("ADStudentPunishmentServiceImpl")
    private ADStudentPunishmentService service;

    @PostMapping("/create")
    @ResponseBody
    public ADStudentPunishment create(ADStudentPunishment student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public ADStudentPunishment update(ADStudentPunishment student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ADStudentPunishment read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ADStudentPunishment> getAll() {
        return service.getAll();
    }

}