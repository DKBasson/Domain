package za.ac.cput.factory.users;

import za.ac.cput.domain.users.PunishmentIfBunkedAlot;

public class PunishmentIfBunkedAlotFactory {
    public static PunishmentIfBunkedAlot getPunishmentIfBunkedAlot(String userID, String firstName, String lastName, String email) {
        return new PunishmentIfBunkedAlot.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


