package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.University;
import za.ac.cput.StudentManagementAttendance.domain.Venue;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface VenueRepository extends IRepository<Venue, String> {
    Set<Venue> getAll();

}
