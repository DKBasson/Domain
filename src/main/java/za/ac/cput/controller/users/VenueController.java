package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.service.users.impl.VenueServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/venue")
public class VenueController {

    @Autowired
    @Qualifier("VenueServiceImpl")
    private VenueServiceImpl service;

    @PostMapping("/new")
    public Venue create(@RequestBody Venue venue){

        return service.create(venue);
    }

    @GetMapping(path = "/find/{id}")
    public Venue findById(@PathVariable String id){

        Venue venue = service.read(id);

        return venue;
    }

    @PutMapping("/update")
    public void update(@RequestBody Venue venue){

        service.update(venue);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Venue> getAll(){
        return service.getAll();
    }

}
