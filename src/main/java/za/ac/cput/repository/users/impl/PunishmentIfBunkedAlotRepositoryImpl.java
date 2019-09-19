package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.repository.users.PunishmentIfBunkedAlotRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("PunishmentIfBunkedAlotInMemory")
public class PunishmentIfBunkedAlotRepositoryImpl implements PunishmentIfBunkedAlotRepository {

    private static PunishmentIfBunkedAlotRepositoryImpl repository = null;
    private Set<PunishmentIfBunkedAlot> punishmentIfBunkedAlots;

    public PunishmentIfBunkedAlotRepositoryImpl(){
        punishmentIfBunkedAlots = new HashSet<>();
    }


    public static PunishmentIfBunkedAlotRepositoryImpl getRepository() {

        if(repository == null){
            return new PunishmentIfBunkedAlotRepositoryImpl();
        }
        return repository;
    }

    @Override
    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot punishmentIfBunkedAlot) {

        punishmentIfBunkedAlots.add(punishmentIfBunkedAlot);
        return punishmentIfBunkedAlot;
    }

    @Override
    public PunishmentIfBunkedAlot read(String id) {

        return punishmentIfBunkedAlots.stream().filter(punishmentIfBunkedAlot -> punishmentIfBunkedAlot.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot punishmentIfBunkedAlot) {

        PunishmentIfBunkedAlot inDB = read(punishmentIfBunkedAlot.getUserID());

        if(inDB != null){
            punishmentIfBunkedAlots.remove(inDB);
            punishmentIfBunkedAlots.add(punishmentIfBunkedAlot);
            return punishmentIfBunkedAlot;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        PunishmentIfBunkedAlot inDB = read(id);
        punishmentIfBunkedAlots.remove(inDB);

    }

    @Override
    public Set<PunishmentIfBunkedAlot> getAll() {
        return punishmentIfBunkedAlots;
    }

}

