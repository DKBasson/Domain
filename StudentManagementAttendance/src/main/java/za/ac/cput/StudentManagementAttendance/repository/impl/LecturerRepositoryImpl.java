package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.Lecturer;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.LecturerRepository;

import java.util.HashSet;
import java.util.Set;

public class LecturerRepositoryImpl implements LecturerRepository {

    private static LecturerRepositoryImpl repository = null;
    private Set<Lecturer> lecturers;

    private LecturerRepositoryImpl() {
        this.lecturers = new HashSet<>();
    }

    public static LecturerRepository getRepository(){
        if(repository == null) repository = new LecturerRepositoryImpl();
        return repository;
    }

    public Lecturer create(Lecturer student){
        this.lecturers.add(student);
        return student;
    }

    public Lecturer read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Lecturer update(Lecturer student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Lecturer> getAll(){
        return this.lecturers;
    }
}
