package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface VenueService extends IService<Venue,String> {
    Set<Venue> getAll();
}