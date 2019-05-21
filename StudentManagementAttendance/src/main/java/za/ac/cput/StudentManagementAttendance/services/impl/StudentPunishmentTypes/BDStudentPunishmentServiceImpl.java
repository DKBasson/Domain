package za.ac.cput.StudentManagementAttendance.services.impl.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.BDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.BDStudentPunishmentService;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.BDStudentService;

import java.util.*;

public class BDStudentPunishmentServiceImpl implements BDStudentPunishmentService {
    @Autowired
    @Qualifier("InMemory")
    private BDStudentPunishmentRepository repository;

    @Override
    public BDStudentPunishment create(BDStudentPunishment student) {
        return repository.create(student);
    }

    @Override
    public BDStudentPunishment update(BDStudentPunishment student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public BDStudentPunishment read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<BDStudentPunishment> getAll() {
        return repository.getAll();
    }
}
