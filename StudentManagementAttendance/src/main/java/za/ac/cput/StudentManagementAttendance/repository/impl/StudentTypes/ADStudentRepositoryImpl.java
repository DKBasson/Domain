package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ADStudentRepositoryImpl implements ADStudentRepository {

    private static ADStudentRepository repository = null;
    private Map<String, ADStudent> students;

    private ADStudentRepositoryImpl() {
        this.students = (Map<String, ADStudent>) new HashSet<>();
    }

    public static ADStudentRepository getRepository(){
        if(repository == null) repository = new ADStudentRepositoryImpl();
        return repository;
    }

    public ADStudent create(ADStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public ADStudent read(String studentId){
        return this.students.get(studentId);
    }

    public ADStudent update(ADStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<ADStudent> getAll(){
        Collection<ADStudent> students = this.students.values();
        Set<ADStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}


