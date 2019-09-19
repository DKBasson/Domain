package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.service.users.impl.SubjectServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceImpl subjectService;

    @PostMapping
    public Subject create(@RequestBody Subject t){
        return subjectService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Subject findById(@PathVariable String id){
        return subjectService.read(id);
    }

    @PutMapping("/update")
    public Subject update(@RequestBody Subject t){
        return subjectService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        subjectService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Subject> getAll(){
        return subjectService.getAll();
    }

}
