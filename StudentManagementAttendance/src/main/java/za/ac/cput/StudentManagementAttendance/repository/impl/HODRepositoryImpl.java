package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class HODRepositoryImpl implements HODRepository {

    private static HODRepositoryImpl repository = null;
    private Set<HOD> hods;

    private HODRepositoryImpl() {
        this.hods = new HashSet<>();
    }

    public static HODRepository getRepository(){
        if(repository == null) repository = new HODRepositoryImpl();
        return repository;
    }

    public HOD create(HOD student){
        this.hods.add(student);
        return student;
    }

    public HOD read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public HOD update(HOD student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<HOD> getAll(){
        return this.hods;
    }
}
