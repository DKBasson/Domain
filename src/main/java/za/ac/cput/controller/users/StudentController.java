package za.ac.cput.controller.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.users.Student;
import za.ac.cput.service.users.impl.StudentServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping
    public Student create(@RequestBody Student t){
        return studentService.create(t);
    }

    @GetMapping(path = "/find/{id}")
    public Student findById(@PathVariable String id){
        return studentService.read(id);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student t){
        return studentService.update(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){

        studentService.delete(id);

    }

    @GetMapping("/getAll")
    public Set<Student> getAll(){
        return studentService.getAll();
    }

}
