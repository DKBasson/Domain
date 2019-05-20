package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ParentRepository extends IRepository<Parent, String> {
    Set<Parent> getAll();

}
