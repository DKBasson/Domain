package za.ac.cput.StudentManagementAttendance.services.impl.StudentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.ADStudentService;

import java.util.*;

public class ADStudentServiceImpl implements ADStudentService {
    @Autowired
    @Qualifier("InMemory")
    private ADStudentRepository repository;

    @Override
    public ADStudent create(ADStudent student) {
        return repository.create(student);
    }

    @Override
    public ADStudent update(ADStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public ADStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<ADStudent> getAll() {
        return repository.getAll();
    }
}
