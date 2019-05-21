package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.UniversityRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.UniversityService;

import java.util.*;
@Service("UniversityServiceImpl ")
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    @Qualifier("UniversityRepository")
    private UniversityRepository repository;

    @Override
    public University create(University student) {
        return repository.create(student);
    }

    @Override
    public University update(University student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public University read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<University> getAll() {
        return repository.getAll();
    }
}
