package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PunishmentIfBunkedAlotRepository;

import java.util.*;
@Service("PunishmentIfBunkedAlotServiceImpl")
public class PunishmentIfBunkedAlotServiceImpl implements PunishmentIfBunkedAlotRepository {
    @Autowired
    @Qualifier("PunishmentIfBunkedAlotRepository")
    private PunishmentIfBunkedAlotRepository repository;

    @Override
    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot student) {
        return repository.create(student);
    }

    @Override
    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public PunishmentIfBunkedAlot read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<PunishmentIfBunkedAlot> getAll() {
        return repository.getAll();
    }
}
