package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.Subject;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.SubjectRepository;

import java.util.HashSet;
import java.util.Set;

public class SubjectRepositoryImpl implements SubjectRepository {

    private static SubjectRepositoryImpl repository = null;
    private Set<Subject> subjects;

    private SubjectRepositoryImpl() {
        this.subjects = new HashSet<>();
    }

    public static SubjectRepository getRepository(){
        if(repository == null) repository = new SubjectRepositoryImpl();
        return repository;
    }

    public Subject create(Subject student){
        this.subjects.add(student);
        return student;
    }

    public Subject read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Subject update(Subject student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Subject> getAll(){
        return this.subjects;
    }
}
