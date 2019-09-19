package za.ac.cput.factory.users;

import za.ac.cput.domain.users.University;

public class UniversityFactory {
    public static University getUniversity(String universityID, String universityName, String universityDisc, String universityLevel) {
        return new University.Builder().universityID(universityID).universityName(universityName).universityDisc(universityDisc).universityLevel(universityLevel).build();
    }
}


