package za.ac.cput.service.users;

import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PunishmentIfBunkedAlotService extends IService<PunishmentIfBunkedAlot, String> {

    Set<PunishmentIfBunkedAlot> getAll();

}