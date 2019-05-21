package za.ac.cput.StudentManagementAttendance.services.impl.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.ADStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.ADStudentPunishmentService;

import java.util.*;
@Service("ADStudentPunishmentServiceImpl")
public class ADStudentPunishmentServiceImpl implements ADStudentPunishmentService {
    @Autowired
    @Qualifier("ADStudentPunishmentRepository")
    private ADStudentPunishmentRepository repository;

    @Override
    public ADStudentPunishment create(ADStudentPunishment student) {
        return repository.create(student);
    }

    @Override
    public ADStudentPunishment update(ADStudentPunishment student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public ADStudentPunishment read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<ADStudentPunishment> getAll() {
        return repository.getAll();
    }
}
