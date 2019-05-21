package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.DDStudentPunishmentService;

import java.util.Set;

@RestController
@RequestMapping("/DDStudentPunishment")
public class DDStudentPunishmentController {
    @Qualifier("DDStudentPunishmentServiceImpl")
    private DDStudentPunishmentService service;

    @PostMapping("/create")
    @ResponseBody
    public DDStudentPunishment create(DDStudentPunishment student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public DDStudentPunishment update(DDStudentPunishment student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public DDStudentPunishment read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<DDStudentPunishment> getAll() {
        return service.getAll();
    }

}