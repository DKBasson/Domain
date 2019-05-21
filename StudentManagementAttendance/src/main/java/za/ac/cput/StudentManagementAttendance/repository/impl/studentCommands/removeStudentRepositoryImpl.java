package za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.addStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

public class removeStudentRepositoryImpl implements removeStudentRepository {

    private static removeStudentRepositoryImpl repository = null;
    private Map<String, removeStudent> students;

    private removeStudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static removeStudentRepository getRepository(){
        if(repository == null) repository = new removeStudentRepositoryImpl();
        return repository;
    }

    public removeStudent create(removeStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public removeStudent read(String studentId){
        return this.students.get(studentId);
    }

    public removeStudent update(removeStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<removeStudent> getAll(){
        Collection<removeStudent> students = this.students.values();
        Set<removeStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

