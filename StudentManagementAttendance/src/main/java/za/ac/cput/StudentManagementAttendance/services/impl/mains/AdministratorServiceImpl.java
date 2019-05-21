package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AdministratorRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.AdministratorService;

import java.util.*;
@Service("AdministratorServiceImpl")
public class AdministratorServiceImpl implements AdministratorService{
    @Autowired
    @Qualifier("AdministratorRepository")
    private AdministratorRepository repository;

    @Override
    public Administrator create(Administrator student) {
        return repository.create(student);
    }

    @Override
    public Administrator update(Administrator student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Administrator read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Administrator> getAll() {
        return repository.getAll();
    }
}