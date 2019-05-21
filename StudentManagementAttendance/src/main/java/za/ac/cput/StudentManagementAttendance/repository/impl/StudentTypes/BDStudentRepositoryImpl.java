package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

public class BDStudentRepositoryImpl implements BDStudentRepository {

    private static BDStudentRepository repository = null;
    private Map<String, BDStudent> students;

    private BDStudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static BDStudentRepository getRepository(){
        if(repository == null) repository = new BDStudentRepositoryImpl();
        return repository;
    }

    public BDStudent create(BDStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public BDStudent read(String studentId){
        return this.students.get(studentId);
    }

    public BDStudent update(BDStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<BDStudent> getAll(){
        Collection<BDStudent> students = this.students.values();
        Set<BDStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}


