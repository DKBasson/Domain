package za.ac.cput.StudentManagementAttendance.services.impl.StudentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.BDStudentService;

import java.util.*;

public class BDStudentServiceImpl implements BDStudentService {
    @Autowired
    @Qualifier("InMemory")
    private BDStudentRepository repository;

    @Override
    public BDStudent create(BDStudent student) {
        return repository.create(student);
    }

    @Override
    public BDStudent update(BDStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public BDStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<BDStudent> getAll() {
        return repository.getAll();
    }
}
