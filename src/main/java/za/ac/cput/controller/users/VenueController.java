package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.service.users.impl.VenueServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/venue")
public class VenueController {

    @Autowired
    private VenueServiceImpl venueService;

    @PostMapping
    public Venue create(@RequestBody Venue t){
        return venueService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Venue findById(@PathVariable String id){
        return venueService.read(id);
    }

    @PutMapping("/update")
    public Venue update(@RequestBody Venue t){
        return venueService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        venueService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Venue> getAll(){
        return venueService.getAll();
    }

}
