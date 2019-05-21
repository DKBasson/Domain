package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.LecturerRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.LecturerService;

import java.util.*;

public class LecturerServiceImpl implements LecturerService {
    @Autowired
    @Qualifier("InMemory")
    private LecturerRepository repository;

    @Override
    public Lecturer create(Lecturer student) {
        return repository.create(student);
    }

    @Override
    public Lecturer update(Lecturer student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Lecturer read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Lecturer> getAll() {
        return repository.getAll();
    }
}
