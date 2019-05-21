package za.ac.cput.StudentManagementAttendance.services.impl.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.MDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.MDStudentPunishmentService;

import java.util.*;

public class MDStudentPunishmentServiceImpl implements MDStudentPunishmentService {
    @Autowired
    @Qualifier("InMemory")
    private MDStudentPunishmentRepository repository;

    @Override
    public MDStudentPunishment create(MDStudentPunishment student) {
        return repository.create(student);
    }

    @Override
    public MDStudentPunishment update(MDStudentPunishment student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public MDStudentPunishment read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<MDStudentPunishment> getAll() {
        return repository.getAll();
    }
}
