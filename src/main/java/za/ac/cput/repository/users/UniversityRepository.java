package za.ac.cput.repository.users;

import za.ac.cput.domain.users.University;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface UniversityRepository extends IRepository<University, String> {

    Set<University> getAll();

}