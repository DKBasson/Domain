package za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.addStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class addStudentRepositoryImpl implements addStudentRepository {

    private static addStudentRepositoryImpl repository = null;
    private Set<addStudent> students;

    private addStudentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static addStudentRepository getRepository(){
        if(repository == null) repository = new addStudentRepositoryImpl();
        return repository;
    }

    public addStudent create(addStudent student){
        this.students.add(student);
        return student;
    }

    public addStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public addStudent update(addStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<addStudent> getAll(){
        return this.students;
    }
}
