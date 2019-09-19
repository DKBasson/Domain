package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.service.users.impl.PunishmentIfBunkedAlotServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/punishmentIfBunkedAlot")
public class PunishmentIfBunkedAlotController {

    @Autowired
    private PunishmentIfBunkedAlotServiceImpl punishmentIfBunkedAlotService;

    @PostMapping
    public PunishmentIfBunkedAlot create(@RequestBody PunishmentIfBunkedAlot t){
        return punishmentIfBunkedAlotService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public PunishmentIfBunkedAlot findById(@PathVariable String id){
        return punishmentIfBunkedAlotService.read(id);
    }

    @PutMapping("/update")
    public PunishmentIfBunkedAlot update(@RequestBody PunishmentIfBunkedAlot t){
        return punishmentIfBunkedAlotService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        punishmentIfBunkedAlotService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<PunishmentIfBunkedAlot> getAll(){
        return punishmentIfBunkedAlotService.getAll();
    }

}
