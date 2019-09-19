package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.service.users.impl.HODServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/hod")
public class HODController {

    @Autowired
    @Qualifier("HODServiceImpl")
    private HODServiceImpl service;

    @PostMapping("/new")
    public HOD create(@RequestBody HOD hod){

        return service.create(hod);
    }

    @GetMapping(path = "/find/{id}")
    public HOD findById(@PathVariable String id){

        HOD hod = service.read(id);

        return hod;
    }

    @PutMapping("/update")
    public void update(@RequestBody HOD hod){

        service.update(hod);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<HOD> getAll(){
        return service.getAll();
    }

}
