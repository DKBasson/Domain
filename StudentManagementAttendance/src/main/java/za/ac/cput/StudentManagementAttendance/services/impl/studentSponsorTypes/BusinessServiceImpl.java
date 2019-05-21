package za.ac.cput.StudentManagementAttendance.services.impl.studentSponsorTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.BusinessRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes.BusinessService;

import java.util.*;

public class BusinessServiceImpl implements BusinessService{
    @Autowired
    @Qualifier("InMemory")
    private BusinessRepository repository;

    @Override
    public Business create(Business student) {
        return repository.create(student);
    }

    @Override
    public Business update(Business student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Business read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Business> getAll() {
        return repository.getAll();
    }
}
