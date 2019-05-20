package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.University;

public class UniversityFactory {

    public static University getUniversity(String universityName, String universityAddress, String universityID) {
        return new University.Builder().universityName(universityName).universityAddress(universityAddress).universityID(universityID).build();
    }

}
