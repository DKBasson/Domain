package za.ac.cput.repository.users;

import za.ac.cput.domain.users.HOD;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface HODRepository extends IRepository<HOD, String> {

    Set<HOD> getAll();

}