package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.repository.users.VenueRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("VenueInMemory")
public class VenueRepositoryImpl implements VenueRepository {

    private static VenueRepositoryImpl repository = null;
    private Set<Venue> venues;

    public VenueRepositoryImpl(){
        venues = new HashSet<>();
    }


    public static VenueRepositoryImpl getRepository() {

        if(repository == null){
            return new VenueRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Venue create(Venue venue) {

        venues.add(venue);
        return venue;
    }

    @Override
    public Venue read(String id) {

        return venues.stream().filter(venue -> venue.getVenueID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Venue update(Venue venue) {

        Venue inDB = read(venue.getVenueID());

        if(inDB != null){
            venues.remove(inDB);
            venues.add(venue);
            return venue;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Venue inDB = read(id);
        venues.remove(inDB);

    }

    @Override
    public Set<Venue> getAll() {
        return venues;
    }

}

