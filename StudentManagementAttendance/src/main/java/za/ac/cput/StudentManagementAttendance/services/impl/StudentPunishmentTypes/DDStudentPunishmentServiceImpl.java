package za.ac.cput.StudentManagementAttendance.services.impl.StudentPunishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.DDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes.DDStudentPunishmentService;

import java.util.*;
@Service("DDStudentPunishmentServiceImpl")
public class DDStudentPunishmentServiceImpl implements DDStudentPunishmentService {
    @Autowired
    @Qualifier("DDStudentPunishmentRepository")
    private DDStudentPunishmentRepository repository;

    @Override
    public DDStudentPunishment create(DDStudentPunishment student) {
        return repository.create(student);
    }

    @Override
    public DDStudentPunishment update(DDStudentPunishment student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public DDStudentPunishment read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<DDStudentPunishment> getAll() {
        return repository.getAll();
    }
}
