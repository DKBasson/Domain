package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.University;
import za.ac.cput.service.users.impl.UniversityServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    @Qualifier("UniversityServiceImpl")
    private UniversityServiceImpl service;

    @PostMapping("/new")
    public University create(@RequestBody University university){

        return service.create(university);
    }

    @GetMapping(path = "/find/{id}")
    public University findById(@PathVariable String id){

        University university = service.read(id);

        return university;
    }

    @PutMapping("/update")
    public void update(@RequestBody University university){

        service.update(university);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<University> getAll(){
        return service.getAll();
    }

}
