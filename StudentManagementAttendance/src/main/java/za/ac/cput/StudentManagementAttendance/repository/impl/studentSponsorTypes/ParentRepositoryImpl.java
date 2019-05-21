package za.ac.cput.StudentManagementAttendance.repository.impl.studentSponsorTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.ParentRepository;

import java.util.*;
@Repository("ParentRepository")
public class ParentRepositoryImpl implements  ParentRepository {

    private static ParentRepositoryImpl repository = null;
    private Map<String, Parent> students;

    private ParentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static ParentRepository getRepository(){
        if(repository == null) repository = new ParentRepositoryImpl();
        return repository;
    }

    public Parent create(Parent student){
        this.students.put(student.getSponsorNum(), student);
        return student;
    }

    public Parent read(String studentId){
        return this.students.get(studentId);
    }

    public Parent update(Parent student) {
        this.students.replace(student.getSponsorNum(), student);
        return this.students.get(student.getSponsorNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Parent> getAll(){
        Collection<Parent> students = this.students.values();
        Set<Parent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

