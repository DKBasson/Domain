package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.BDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.DDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DDStudentPunishmentRepositoryImpl implements DDStudentPunishmentRepository {

    private static DDStudentPunishmentRepositoryImpl repository = null;
    private Map<String, DDStudentPunishment> students;

    private DDStudentPunishmentRepositoryImpl() {
        this.students = (Map<String, DDStudentPunishment>) new HashSet<>();
    }

    public static DDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new DDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public DDStudentPunishment create(DDStudentPunishment student){
        this.students.put(student.getPunishmentID(), student);
        return student;
    }

    public DDStudentPunishment read(String studentId){
        return this.students.get(studentId);
    }

    public DDStudentPunishment update(DDStudentPunishment student) {
        this.students.replace(student.getPunishmentID(), student);
        return this.students.get(student.getPunishmentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<DDStudentPunishment> getAll(){
        Collection<DDStudentPunishment> students = this.students.values();
        Set<DDStudentPunishment> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

