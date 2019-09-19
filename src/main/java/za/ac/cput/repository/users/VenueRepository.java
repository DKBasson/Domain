package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Venue;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface VenueRepository extends IRepository<Venue, String> {

    Set<Venue> getAll();

}