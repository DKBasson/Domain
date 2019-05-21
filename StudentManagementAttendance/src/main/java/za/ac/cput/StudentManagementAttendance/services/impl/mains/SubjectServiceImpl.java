package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.SubjectRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.SubjectService;

import java.util.*;
@Service("SubjectServiceImpl")
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    @Qualifier("SubjectRepository")
    private SubjectRepository repository;

    @Override
    public Subject create(Subject student) {
        return repository.create(student);
    }

    @Override
    public Subject update(Subject student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Subject read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Subject> getAll() {
        return repository.getAll();
    }
}
