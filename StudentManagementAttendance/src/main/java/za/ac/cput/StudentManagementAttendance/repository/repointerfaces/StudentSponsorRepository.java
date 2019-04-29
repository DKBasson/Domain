package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface StudentSponsorRepository extends IRepository<StudentSponsor, String> {
    Set<StudentSponsor> getAll();

}
