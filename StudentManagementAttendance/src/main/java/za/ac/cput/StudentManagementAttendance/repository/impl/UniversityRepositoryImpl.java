package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.University;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.UniversityRepository;

import java.util.HashSet;
import java.util.Set;

public class UniversityRepositoryImpl implements UniversityRepository {

    private static UniversityRepositoryImpl repository = null;
    private Set<University> universities;

    private UniversityRepositoryImpl() {
        this.universities = new HashSet<>();
    }

    public static UniversityRepository getRepository(){
        if(repository == null) repository = new UniversityRepositoryImpl();
        return repository;
    }

    public University create(University student){
        this.universities.add(student);
        return student;
    }

    public University read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public University update(University student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<University> getAll(){
        return this.universities;
    }
}
