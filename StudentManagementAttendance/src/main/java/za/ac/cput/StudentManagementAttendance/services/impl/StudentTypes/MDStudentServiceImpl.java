package za.ac.cput.StudentManagementAttendance.services.impl.StudentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes.MDStudentService;

import java.util.*;
@Service("MDStudentServiceImpl")
public class MDStudentServiceImpl implements MDStudentService {
    @Autowired
    @Qualifier("MDStudentRepository")
    private MDStudentRepository repository;

    @Override
    public MDStudent create(MDStudent student) {
        return repository.create(student);
    }

    @Override
    public MDStudent update(MDStudent student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public MDStudent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<MDStudent> getAll() {
        return repository.getAll();
    }
}
