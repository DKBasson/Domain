package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PersonRepository;

import java.util.*;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository = null;
    private Map<String, Person> persons;

    private PersonRepositoryImpl() {
        this.persons = new HashMap<>();
    }

    public static PersonRepository getRepository(){
        if(repository == null) repository = new PersonRepositoryImpl();
        return repository;
    }

    public Person create(Person student){
        this.persons.put(student.getPersonName(), student);
        return student;
    }

    public Person read(String studentId){
        return this.persons.get(studentId);
    }

    public Person update(Person student) {
        this.persons.replace(student.getPersonName(), student);
        return this.persons.get(student.getPersonName());
    }

    public void delete(String studentId) {
        this.persons.remove(studentId);

    }

    public Set<Person> getAll(){
        Collection<Person> persons = this.persons.values();
        Set<Person> set = new HashSet<>();
        set.addAll(persons);
        return set;
    }}
