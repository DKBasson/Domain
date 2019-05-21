package za.ac.cput.StudentManagementAttendance.services.impl.StudentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.DDStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.DDStudentService;

import java.util.*;
@Service("DDStudentServiceImpl")
public class DDStudentServiceImpl implements DDStudentService {
    @Autowired
    @Qualifier("DDStudentRepository")
    private DDStudentRepository repository;

    @Override
    public DDStudent create(DDStudent student) {
        return repository.create(student);
    }

    @Override
    public DDStudent update(DDStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public DDStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<DDStudent> getAll() {
        return repository.getAll();
    }
}
