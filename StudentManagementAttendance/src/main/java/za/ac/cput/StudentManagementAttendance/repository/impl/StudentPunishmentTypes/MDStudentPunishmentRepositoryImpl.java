package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.DDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.MDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

public class MDStudentPunishmentRepositoryImpl implements MDStudentPunishmentRepository {

    private static MDStudentPunishmentRepositoryImpl repository = null;
    private Map<String, MDStudentPunishment> students;

    private MDStudentPunishmentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static MDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new MDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public MDStudentPunishment create(MDStudentPunishment student){
        this.students.put(student.getPunishmentID(), student);
        return student;
    }

    public MDStudentPunishment read(String studentId){
        return this.students.get(studentId);
    }

    public MDStudentPunishment update(MDStudentPunishment student) {
        this.students.replace(student.getPunishmentID(), student);
        return this.students.get(student.getPunishmentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<MDStudentPunishment> getAll(){
        Collection<MDStudentPunishment> students = this.students.values();
        Set<MDStudentPunishment> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

