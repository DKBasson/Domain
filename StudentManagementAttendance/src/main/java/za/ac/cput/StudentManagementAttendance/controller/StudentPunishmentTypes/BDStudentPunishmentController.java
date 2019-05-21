package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.BDStudentPunishmentService;

import java.util.Set;

@RestController
@RequestMapping("/BDStudentPunishment")
public class BDStudentPunishmentController {
    @Qualifier("BDStudentPunishmentServiceImpl")
    private BDStudentPunishmentService service;

    @PostMapping("/create")
    @ResponseBody
    public BDStudentPunishment create(BDStudentPunishment student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public BDStudentPunishment update(BDStudentPunishment student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BDStudentPunishment read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BDStudentPunishment> getAll() {
        return service.getAll();
    }

}