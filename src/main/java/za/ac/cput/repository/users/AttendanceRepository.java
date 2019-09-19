package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Attendance;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface AttendanceRepository extends IRepository<Attendance, String> {

    Set<Attendance> getAll();

}