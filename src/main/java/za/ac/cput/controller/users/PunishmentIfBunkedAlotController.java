package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.service.users.impl.PunishmentIfBunkedAlotServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/punishmentIfBunkedAlot")
public class PunishmentIfBunkedAlotController {

    @Autowired
    @Qualifier("PunishmentIfBunkedAlotServiceImpl")
    private PunishmentIfBunkedAlotServiceImpl service;

    @PostMapping("/new")
    public PunishmentIfBunkedAlot create(@RequestBody PunishmentIfBunkedAlot punishmentIfBunkedAlot){

        return service.create(punishmentIfBunkedAlot);
    }

    @GetMapping(path = "/find/{id}")
    public PunishmentIfBunkedAlot findById(@PathVariable String id){

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = service.read(id);

        return punishmentIfBunkedAlot;
    }

    @PutMapping("/update")
    public void update(@RequestBody PunishmentIfBunkedAlot punishmentIfBunkedAlot){

        service.update(punishmentIfBunkedAlot);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<PunishmentIfBunkedAlot> getAll(){
        return service.getAll();
    }

}
