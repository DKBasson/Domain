package za.ac.cput.StudentManagementAttendance.repository.impl.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.ParentRepository;

import java.util.HashSet;
import java.util.Set;

public class ParentRepositoryImpl implements  ParentRepository {

    private static ParentRepositoryImpl repository = null;
    private Set<Parent> students;

    private ParentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static ParentRepository getRepository(){
        if(repository == null) repository = new ParentRepositoryImpl();
        return repository;
    }

    public Parent create(Parent student){
        this.students.add(student);
        return student;
    }

    public Parent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Parent update(Parent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Parent> getAll(){
        return this.students;
    }
}
