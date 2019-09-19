package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Person;
import za.ac.cput.service.users.impl.PersonServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping
    public Person create(@RequestBody Person t){
        return personService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Person findById(@PathVariable String id){
        return personService.read(id);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person t){
        return personService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        personService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Person> getAll(){
        return personService.getAll();
    }

}
