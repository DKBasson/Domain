package za.ac.cput.service.users;

import za.ac.cput.domain.users.University;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface UniversityService extends IService<University, String> {

    Set<University> getAll();

}