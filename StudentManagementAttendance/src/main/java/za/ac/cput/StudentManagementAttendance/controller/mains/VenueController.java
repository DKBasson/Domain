package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.VenueService;

import java.util.Set;
@RestController
@RequestMapping("/Venue")
public class VenueController {
    @Qualifier("VenueServiceImpl")
    private VenueService service;

    @PostMapping("/create")
    @ResponseBody
    public Venue create(Venue student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Venue update(Venue student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Venue read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Venue> getAll() {
        return service.getAll();
    }

}