package za.ac.cput.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.service.users.impl.AttendanceServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    @Qualifier("AttendanceServiceImpl")
    private AttendanceServiceImpl service;

    @PostMapping("/new")
    public Attendance create(@RequestBody Attendance attendance){

        return service.create(attendance);
    }

    @GetMapping(path = "/find/{id}")
    public Attendance findById(@PathVariable String id){

        Attendance attendance = service.read(id);

        return attendance;
    }

    @PutMapping("/update")
    public void update(@RequestBody Attendance attendance){

        service.update(attendance);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Attendance> getAll(){
        return service.getAll();
    }

}
