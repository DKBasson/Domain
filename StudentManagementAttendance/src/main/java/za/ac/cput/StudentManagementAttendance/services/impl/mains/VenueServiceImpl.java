package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.VenueRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.VenueService;

import java.util.*;
@Service("VenueServiceImpl ")
public class VenueServiceImpl implements VenueService {
    @Autowired
    @Qualifier("VenueRepository")
    private VenueRepository repository;

    @Override
    public Venue create(Venue student) {
        return repository.create(student);
    }

    @Override
    public Venue update(Venue student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Venue read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Venue> getAll() {
        return repository.getAll();
    }
}
