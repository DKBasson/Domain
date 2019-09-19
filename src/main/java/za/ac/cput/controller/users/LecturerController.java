package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.service.users.impl.LecturerServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    @Autowired
    private LecturerServiceImpl lecturerService;

    @PostMapping
    public Lecturer create(@RequestBody Lecturer t){
        return lecturerService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Lecturer findById(@PathVariable String id){
        return lecturerService.read(id);
    }

    @PutMapping("/update")
    public Lecturer update(@RequestBody Lecturer t){
        return lecturerService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        lecturerService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Lecturer> getAll(){
        return lecturerService.getAll();
    }

}
