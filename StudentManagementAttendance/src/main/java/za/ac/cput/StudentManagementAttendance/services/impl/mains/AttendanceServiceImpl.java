package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AttendanceRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.AttendanceService;

import java.util.*;
@Service("AttendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService{
    @Autowired
    @Qualifier("AttendanceRepositoryI")
    private AttendanceRepository repository;

    @Override
    public Attendance create(Attendance student) {
        return repository.create(student);
    }

    @Override
    public Attendance update(Attendance student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Attendance read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Attendance> getAll() {
        return repository.getAll();
    }
}
