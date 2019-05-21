package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.ADStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

@Repository("ADStudentPunishmentRepository")
public class ADStudentPunishmentRepositoryImpl implements ADStudentPunishmentRepository {

    private static ADStudentPunishmentRepositoryImpl repository = null;
    private Map<String, ADStudentPunishment> students;

    private ADStudentPunishmentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static ADStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new ADStudentPunishmentRepositoryImpl();
        return repository;
    }

    public ADStudentPunishment create(ADStudentPunishment student){
        this.students.put(student.getPunishmentID(), student);
        return student;
    }

    public ADStudentPunishment read(String studentId){
        return this.students.get(studentId);
    }

    public ADStudentPunishment update(ADStudentPunishment student) {
        this.students.replace(student.getPunishmentID(), student);
        return this.students.get(student.getPunishmentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<ADStudentPunishment> getAll(){
        Collection<ADStudentPunishment> students = this.students.values();
        Set<ADStudentPunishment> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

