package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.service.users.impl.AdministratorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorServiceImpl administratorService;

    @PostMapping
    public Administrator create(@RequestBody Administrator t){
        return administratorService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Administrator findById(@PathVariable String id){
        return administratorService.read(id);
    }

    @PutMapping("/update")
    public Administrator update(@RequestBody Administrator t){
        return administratorService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        administratorService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Administrator> getAll(){
        return administratorService.getAll();
    }

}
