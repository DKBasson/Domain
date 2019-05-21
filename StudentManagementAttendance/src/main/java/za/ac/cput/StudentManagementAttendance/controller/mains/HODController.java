package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.HODService;

import java.util.Set;
@RestController
@RequestMapping("/hod")
public class HODController {
    @Qualifier("HODServiceImpl")
    private HODService service;

    @PostMapping("/create")
    @ResponseBody
    public HOD create(HOD student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public HOD update(HOD student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public HOD read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<HOD> getAll() {
        return service.getAll();
    }

}