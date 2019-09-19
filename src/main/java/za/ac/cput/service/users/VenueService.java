package za.ac.cput.service.users;

import za.ac.cput.domain.users.Venue;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface VenueService extends IService<Venue, String> {

    Set<Venue> getAll();

}