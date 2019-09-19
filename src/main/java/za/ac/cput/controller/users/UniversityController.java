package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.University;
import za.ac.cput.service.users.impl.UniversityServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private UniversityServiceImpl universityService;

    @PostMapping
    public University create(@RequestBody University t){
        return universityService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public University findById(@PathVariable String id){
        return universityService.read(id);
    }

    @PutMapping("/update")
    public University update(@RequestBody University t){
        return universityService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        universityService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<University> getAll(){
        return universityService.getAll();
    }

}
