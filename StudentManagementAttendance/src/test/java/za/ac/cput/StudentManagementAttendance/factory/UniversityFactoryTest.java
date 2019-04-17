package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.University;

public class UniversityFactoryTest {

    public static University getUniversity(String universityName, String universityAddress, int universityID) {
        return new University.Builder().universityName(universityName).universityAddress(universityAddress).universityID(universityID).build();
    }

}
