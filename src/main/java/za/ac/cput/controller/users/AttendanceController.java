package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.service.users.impl.AttendanceServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceServiceImpl attendanceService;

    @PostMapping
    public Attendance create(@RequestBody Attendance t){
        return attendanceService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Attendance findById(@PathVariable String id){
        return attendanceService.read(id);
    }

    @PutMapping("/update")
    public Attendance update(@RequestBody Attendance t){
        return attendanceService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        attendanceService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Attendance> getAll(){
        return attendanceService.getAll();
    }

}
