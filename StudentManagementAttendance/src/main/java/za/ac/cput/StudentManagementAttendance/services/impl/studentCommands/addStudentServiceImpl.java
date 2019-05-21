package za.ac.cput.StudentManagementAttendance.services.impl.studentCommands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.addStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands.addStudentService;

import java.util.*;

public class addStudentServiceImpl implements addStudentService {
    @Autowired
    @Qualifier("InMemory")
    private addStudentRepository repository;

    @Override
    public addStudent create(addStudent student) {
        return repository.create(student);
    }

    @Override
    public addStudent update(addStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public addStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<addStudent> getAll() {
        return repository.getAll();
    }
}
