package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.Lecturer;
import za.ac.cput.StudentManagementAttendance.domain.Person;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.LecturerRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository = null;
    private Set<Person> people;

    private PersonRepositoryImpl() {
        this.people = new HashSet<>();
    }

    public static PersonRepository getRepository(){
        if(repository == null) repository = new PersonRepositoryImpl();
        return repository;
    }

    public Person create(Person student){
        this.people.add(student);
        return student;
    }

    public Person read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Person update(Person student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Person> getAll(){
        return this.people;
    }
}
