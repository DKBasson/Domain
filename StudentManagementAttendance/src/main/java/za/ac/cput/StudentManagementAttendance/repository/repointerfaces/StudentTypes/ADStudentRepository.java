package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes;

        import za.ac.cput.StudentManagementAttendance.domain.Student;
        import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
        import za.ac.cput.StudentManagementAttendance.repository.IRepository;

        import java.util.HashSet;
        import java.util.Set;

public interface ADStudentRepository extends IRepository<ADStudent, String> {
    Set<ADStudent> getAll();

}