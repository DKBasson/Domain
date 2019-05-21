package za.ac.cput.StudentManagementAttendance.services.impl.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PersonRepository;
import za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains.PersonService;

import java.util.*;

public class PersonServiceImpl implements PersonService {
    @Autowired
    @Qualifier("InMemory")
    private PersonRepository repository;

    @Override
    public Person create(Person student) {
        return repository.create(student);
    }

    @Override
    public Person update(Person student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Person read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Person> getAll() {
        return repository.getAll();
    }
}
