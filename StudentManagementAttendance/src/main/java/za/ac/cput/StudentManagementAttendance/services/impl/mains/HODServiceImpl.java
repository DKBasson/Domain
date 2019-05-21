package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.HODRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.HODService;

import java.util.*;
@Service("HODServiceImpl")
public class HODServiceImpl implements HODService {
    @Autowired
    @Qualifier("HODRepository")
    private HODRepository repository;

    @Override
    public HOD create(HOD student) {
        return repository.create(student);
    }

    @Override
    public HOD update(HOD student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public HOD read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<HOD> getAll() {
        return repository.getAll();
    }
}
