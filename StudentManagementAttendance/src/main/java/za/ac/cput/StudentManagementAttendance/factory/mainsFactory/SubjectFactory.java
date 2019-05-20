package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;

public class SubjectFactory {
    public static Subject getSubject(String subjectName, String subjectID) {
        return new Subject.Builder().subjectName(subjectName).subjectID(subjectID).build();
    }
}
