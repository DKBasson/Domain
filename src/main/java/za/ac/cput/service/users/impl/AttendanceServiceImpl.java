package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.repository.users.AttendanceRepository;
import za.ac.cput.repository.users.impl.AttendanceRepositoryImpl;
import za.ac.cput.service.users.AttendanceService;

import java.util.HashSet;
import java.util.Set;

@Repository("AttendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService {

    private AttendanceServiceImpl service = null;
    private AttendanceRepository repository;

    public AttendanceServiceImpl() {
        repository = AttendanceRepositoryImpl.getRepository();
    }

    public AttendanceServiceImpl getService(){

        if(service == null){
            return new AttendanceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Attendance> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Attendance create(Attendance attendance) {
        return repository.create(attendance);
    }

    @Override
    public Attendance read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Attendance update(Attendance attendance) {
        return repository.update(attendance);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

