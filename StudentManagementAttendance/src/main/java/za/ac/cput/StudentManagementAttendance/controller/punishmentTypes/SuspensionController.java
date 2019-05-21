package za.ac.cput.StudentManagementAttendance.controller.punishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes.SuspensionService;


import java.util.Set;
@RestController
@RequestMapping("/Suspension")
public class SuspensionController {
    @Qualifier("SuspensionServiceImpl")
    private SuspensionService service;

    @PostMapping("/create")
    @ResponseBody
    public Suspension create(Suspension student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Suspension update(Suspension student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Suspension read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Suspension> getAll() {
        return service.getAll();
    }

}