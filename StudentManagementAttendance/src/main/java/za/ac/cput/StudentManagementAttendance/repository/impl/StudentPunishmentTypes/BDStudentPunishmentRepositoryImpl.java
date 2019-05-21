package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.ADStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.BDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;

import java.util.*;

@Repository("BDStudentPunishmentRepository")
public class BDStudentPunishmentRepositoryImpl implements BDStudentPunishmentRepository {

    private static BDStudentPunishmentRepositoryImpl repository = null;
    private Map<String, BDStudentPunishment> students;

    private BDStudentPunishmentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static BDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new BDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public BDStudentPunishment create(BDStudentPunishment student){
        this.students.put(student.getPunishmentID(), student);
        return student;
    }

    public BDStudentPunishment read(String studentId){
        return this.students.get(studentId);
    }

    public BDStudentPunishment update(BDStudentPunishment student) {
        this.students.replace(student.getPunishmentID(), student);
        return this.students.get(student.getPunishmentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<BDStudentPunishment> getAll(){
        Collection<BDStudentPunishment> students = this.students.values();
        Set<BDStudentPunishment> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

