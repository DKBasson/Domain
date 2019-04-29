package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Person;
import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public interface PersonRepository extends IRepository<Person, String> {
    Set<Person> getAll();

}
