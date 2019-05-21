package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes.BusinessService;

import java.util.Set;

@RestController
@RequestMapping("/Business")
public class BusinessController {
    @Qualifier("BusinessServiceImpl")
    private BusinessService service;

    @PostMapping("/create")
    @ResponseBody
    public Business create(Business student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Business update(Business student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Business read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Business> getAll() {
        return service.getAll();
    }

}