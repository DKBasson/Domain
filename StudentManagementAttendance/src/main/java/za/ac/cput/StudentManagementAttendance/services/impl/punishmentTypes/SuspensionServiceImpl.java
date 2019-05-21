package za.ac.cput.StudentManagementAttendance.services.impl.punishmentTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.SuspensionRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes.SuspensionService;

import java.util.*;
@Service("SuspensionServiceImpl")
public class SuspensionServiceImpl implements SuspensionService {
    @Autowired
    @Qualifier("SuspensionRepository")
    private SuspensionRepository repository;

    @Override
    public Suspension create(Suspension student) {
        return repository.create(student);
    }

    @Override
    public Suspension update(Suspension student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Suspension read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Suspension> getAll() {
        return repository.getAll();
    }
}
