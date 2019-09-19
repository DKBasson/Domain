package za.ac.cput.service.users;

import za.ac.cput.domain.users.HOD;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface HODService extends IService<HOD, String> {

    Set<HOD> getAll();

}