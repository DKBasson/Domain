package za.ac.cput.service.users;

import za.ac.cput.domain.users.Subject;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface SubjectService extends IService<Subject, String> {

    Set<Subject> getAll();

}