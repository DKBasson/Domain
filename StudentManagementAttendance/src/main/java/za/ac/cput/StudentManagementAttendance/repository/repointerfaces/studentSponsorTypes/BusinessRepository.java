package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface BusinessRepository extends IRepository<Business, String> {
    Set<Business> getAll();

}
