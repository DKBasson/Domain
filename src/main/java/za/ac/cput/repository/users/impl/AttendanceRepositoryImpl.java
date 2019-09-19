package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.repository.users.AttendanceRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("AttendanceInMemory")
public class AttendanceRepositoryImpl implements AttendanceRepository {

    private static AttendanceRepositoryImpl repository = null;
    private Set<Attendance> attendances;

    public AttendanceRepositoryImpl(){
        attendances = new HashSet<>();
    }


    public static AttendanceRepositoryImpl getRepository() {

        if(repository == null){
            return new AttendanceRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Attendance create(Attendance attendance) {

        attendances.add(attendance);
        return attendance;
    }

    @Override
    public Attendance read(String id) {

        return attendances.stream().filter(attendance -> attendance.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Attendance update(Attendance attendance) {

        Attendance inDB = read(attendance.getUserID());

        if(inDB != null){
            attendances.remove(inDB);
            attendances.add(attendance);
            return attendance;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Attendance inDB = read(id);
        attendances.remove(inDB);

    }

    @Override
    public Set<Attendance> getAll() {
        return attendances;
    }

}

