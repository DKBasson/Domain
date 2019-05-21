package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentSponsorRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.StudentSponsorService;

import java.util.*;

public class StudentSponsorServiceImpl implements StudentSponsorService {
    @Autowired
    @Qualifier("InMemory")
    private StudentSponsorRepository repository;

    @Override
    public StudentSponsor create(StudentSponsor student) {
        return repository.create(student);
    }

    @Override
    public StudentSponsor update(StudentSponsor student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public StudentSponsor read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<StudentSponsor> getAll() {
        return repository.getAll();
    }
}
