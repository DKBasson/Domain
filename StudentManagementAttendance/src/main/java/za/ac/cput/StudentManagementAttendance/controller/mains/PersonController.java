package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.PersonService;

import java.util.Set;
@RestController
@RequestMapping("/person")
public class PersonController {
    @Qualifier("PersonServiceImpl")
    private PersonService service;

    @PostMapping("/create")
    @ResponseBody
    public Person create(Person student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Person update(Person student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Person read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Person> getAll() {
        return service.getAll();
    }

}