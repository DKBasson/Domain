package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.service.users.impl.StudentSponsorServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/studentSponsor")
public class StudentSponsorController {

    @Autowired
    private StudentSponsorServiceImpl studentSponsorService;

    @PostMapping
    public StudentSponsor create(@RequestBody StudentSponsor t){
        return studentSponsorService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public StudentSponsor findById(@PathVariable String id){
        return studentSponsorService.read(id);
    }

    @PutMapping("/update")
    public StudentSponsor update(@RequestBody StudentSponsor t){
        return studentSponsorService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        studentSponsorService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<StudentSponsor> getAll(){
        return studentSponsorService.getAll();
    }

}
