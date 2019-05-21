package za.ac.cput.StudentManagementAttendance.services.impl.studentSponsorTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.ParentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes.ParentService;

import java.util.*;

public class ParentServiceImpl implements ParentService {
    @Autowired
    @Qualifier("InMemory")
    private ParentRepository repository;

    @Override
    public Parent create(Parent student) {
        return repository.create(student);
    }

    @Override
    public Parent update(Parent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Parent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Parent> getAll() {
        return repository.getAll();
    }
}
