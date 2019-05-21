package za.ac.cput.StudentManagementAttendance.services.impl.studentCommands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands.removeStudentService;

import java.util.*;
@Service("removeStudentServiceImpl")
public class removeStudentServiceImpl implements removeStudentService {
    @Autowired
    @Qualifier("removeStudentRepository")
    private removeStudentRepository repository;

    @Override
    public removeStudent create(removeStudent student) {
        return repository.create(student);
    }

    @Override
    public removeStudent update(removeStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public removeStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<removeStudent> getAll() {
        return repository.getAll();
    }
}
