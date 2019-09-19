package za.ac.cput.factory.users;

import za.ac.cput.domain.users.HOD;

public class HODFactory {
    public static HOD getHOD(String userID, String firstName, String lastName, String email) {
        return new HOD.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


