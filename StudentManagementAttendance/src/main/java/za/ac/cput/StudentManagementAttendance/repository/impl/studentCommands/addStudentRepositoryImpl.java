package za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.punishmentTypes.SuspensionRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.SuspensionRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.addStudentRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class addStudentRepositoryImpl implements addStudentRepository {

    private static addStudentRepositoryImpl repository = null;
    private Map<String, addStudent> students;

    private addStudentRepositoryImpl() {
        this.students = (Map<String, addStudent>) new HashSet<>();
    }

    public static addStudentRepository getRepository(){
        if(repository == null) repository = new addStudentRepositoryImpl();
        return repository;
    }

    public addStudent create(addStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public addStudent read(String studentId){
        return this.students.get(studentId);
    }

    public addStudent update(addStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<addStudent> getAll(){
        Collection<addStudent> students = this.students.values();
        Set<addStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

