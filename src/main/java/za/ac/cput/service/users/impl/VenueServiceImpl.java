package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.repository.users.VenueRepository;
import za.ac.cput.repository.users.impl.VenueRepositoryImpl;
import za.ac.cput.service.users.VenueService;

import java.util.HashSet;
import java.util.Set;

@Repository("VenueServiceImpl")
public class VenueServiceImpl implements VenueService {

    private VenueServiceImpl service = null;
    private VenueRepository repository;

    public VenueServiceImpl() {
        repository = VenueRepositoryImpl.getRepository();
    }

    public VenueServiceImpl getService(){

        if(service == null){
            return new VenueServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Venue> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Venue create(Venue venue) {
        return repository.create(venue);
    }

    @Override
    public Venue read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Venue update(Venue venue) {
        return repository.update(venue);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

