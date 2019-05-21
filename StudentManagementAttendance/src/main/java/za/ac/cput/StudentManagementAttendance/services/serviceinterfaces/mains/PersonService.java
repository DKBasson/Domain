package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface PersonService extends IService<Person,String> {
    Set<Person> getAll();
}