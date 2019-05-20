package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.DDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DDStudentRepositoryImpl implements DDStudentRepository {

    private static DDStudentRepository repository = null;
    private Map<String, DDStudent> students;

    private DDStudentRepositoryImpl() {
        this.students = (Map<String, DDStudent>) new HashSet<>();
    }

    public static DDStudentRepository getRepository(){
        if(repository == null) repository = new DDStudentRepositoryImpl();
        return repository;
    }

    public DDStudent create(DDStudent student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public DDStudent read(String studentId){
        return this.students.get(studentId);
    }

    public DDStudent update(DDStudent student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<DDStudent> getAll(){
        Collection<DDStudent> students = this.students.values();
        Set<DDStudent> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}


