package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

public class MDStudentRepositoryImpl implements MDStudentRepository {

    private static MDStudentRepository repository = null;
    private Map<String, MDStudent> students;

    private MDStudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static MDStudentRepository getRepository(){
        if(repository == null) repository = new MDStudentRepositoryImpl();
        return repository;
    }

    public MDStudent create(MDStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public MDStudent read(String studentId){
        return this.students.get(studentId);
    }

    public MDStudent update(MDStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<MDStudent> getAll(){
        Collection<MDStudent> students = this.students.values();
        Set<MDStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}


