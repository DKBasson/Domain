package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface PersonRepository extends IRepository<Person, String> {
    Set<Person> getAll();

}
