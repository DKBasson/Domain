package za.ac.cput.StudentManagementAttendance.services.impl.punishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.ExpulsionRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes.ExpulsionService;

import java.util.*;

public class ExpulsionServiceImpl implements ExpulsionService {
    @Autowired
    @Qualifier("InMemory")
    private ExpulsionRepository repository;

    @Override
    public Expulsion create(Expulsion student) {
        return repository.create(student);
    }

    @Override
    public Expulsion update(Expulsion student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Expulsion read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Expulsion> getAll() {
        return repository.getAll();
    }
}
