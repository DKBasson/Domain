package za.ac.cput.StudentManagementAttendance.controller.punishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes.ExpulsionService;


import java.util.Set;
@RestController
@RequestMapping("/Expulsion")
public class ExpulsionController {
    @Qualifier("ExpulsionServiceImpl")
    private ExpulsionService service;

    @PostMapping("/create")
    @ResponseBody
    public Expulsion create(Expulsion student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Expulsion update(Expulsion student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Expulsion read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Expulsion> getAll() {
        return service.getAll();
    }

}