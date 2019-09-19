package za.ac.cput.repository.users;

import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PunishmentIfBunkedAlotRepository extends IRepository<PunishmentIfBunkedAlot, String> {

    Set<PunishmentIfBunkedAlot> getAll();

}