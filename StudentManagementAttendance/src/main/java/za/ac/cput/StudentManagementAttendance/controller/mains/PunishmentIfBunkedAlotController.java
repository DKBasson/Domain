package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.PunishmentIfBunkedAlotService;

import java.util.Set;
@RestController
@RequestMapping("/PunishmentIfBunkedAlot")
public class PunishmentIfBunkedAlotController {
    @Qualifier("PunishmentIfBunkedAlotServiceImpl")
    private PunishmentIfBunkedAlotService service;

    @PostMapping("/create")
    @ResponseBody
    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PunishmentIfBunkedAlot read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<PunishmentIfBunkedAlot> getAll() {
        return service.getAll();
    }

}