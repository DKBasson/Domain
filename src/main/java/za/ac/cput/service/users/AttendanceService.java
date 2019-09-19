package za.ac.cput.service.users;

import za.ac.cput.domain.users.Attendance;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AttendanceService extends IService<Attendance, String> {

    Set<Attendance> getAll();

}