package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.repository.users.PunishmentIfBunkedAlotRepository;
import za.ac.cput.repository.users.impl.PunishmentIfBunkedAlotRepositoryImpl;
import za.ac.cput.service.users.PunishmentIfBunkedAlotService;

import java.util.HashSet;
import java.util.Set;

@Repository("PunishmentIfBunkedAlotServiceImpl")
public class PunishmentIfBunkedAlotServiceImpl implements PunishmentIfBunkedAlotService {

    private PunishmentIfBunkedAlotServiceImpl service = null;
    private PunishmentIfBunkedAlotRepository repository;

    public PunishmentIfBunkedAlotServiceImpl() {
        repository = PunishmentIfBunkedAlotRepositoryImpl.getRepository();
    }

    public PunishmentIfBunkedAlotServiceImpl getService(){

        if(service == null){
            return new PunishmentIfBunkedAlotServiceImpl();
        }
        return service;
    }

    @Override
    public Set<PunishmentIfBunkedAlot> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot punishmentIfBunkedAlot) {
        return repository.create(punishmentIfBunkedAlot);
    }

    @Override
    public PunishmentIfBunkedAlot read(String integer) {
        return repository.read(integer);
    }

    @Override
    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot punishmentIfBunkedAlot) {
        return repository.update(punishmentIfBunkedAlot);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

