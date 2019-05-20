package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface VenueRepository extends IRepository<Venue, String> {
    Set<Venue> getAll();

}
