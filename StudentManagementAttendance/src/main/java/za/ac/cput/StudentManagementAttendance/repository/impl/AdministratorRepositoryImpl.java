package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.AdministratorRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;

import java.util.HashSet;
import java.util.Set;

public class AdministratorRepositoryImpl implements AdministratorRepository {

    private static AdministratorRepositoryImpl repository = null;
    private Set<Administrator> administrators;

    private AdministratorRepositoryImpl() {
        this.administrators = new HashSet<>();
    }

    public static AdministratorRepository getRepository(){
        if(repository == null) repository = new AdministratorRepositoryImpl();
        return repository;
    }

    public Administrator create(Administrator student){
        this.administrators.add(student);
        return student;
    }

    public Administrator read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Administrator update(Administrator student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Administrator> getAll(){
        return this.administrators;
    }
}
