package za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class removeStudentRepositoryImpl implements removeStudentRepository {

    private static removeStudentRepositoryImpl repository = null;
    private Set<removeStudent> students;

    private removeStudentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static removeStudentRepository getRepository(){
        if(repository == null) repository = new removeStudentRepositoryImpl();
        return repository;
    }

    public removeStudent create(removeStudent student){
        this.students.add(student);
        return student;
    }

    public removeStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public removeStudent update(removeStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<removeStudent> getAll(){
        return this.students;
    }
}
