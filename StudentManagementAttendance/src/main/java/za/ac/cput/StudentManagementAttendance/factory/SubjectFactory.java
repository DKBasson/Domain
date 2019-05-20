package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.Subject;

public class SubjectFactory {
    public static Subject getStudent(String subjectName, int subjectID) {
        return new Subject.Builder().subjectName(subjectName).subjectID(subjectID).build();
    }
}
