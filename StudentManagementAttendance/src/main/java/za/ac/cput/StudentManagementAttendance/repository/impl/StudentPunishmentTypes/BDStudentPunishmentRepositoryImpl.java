package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.BDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class BDStudentPunishmentRepositoryImpl implements BDStudentPunishmentRepository {

    private static BDStudentPunishmentRepositoryImpl repository = null;
    private Set<BDStudentPunishment> students;

    private BDStudentPunishmentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static BDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new BDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public BDStudentPunishment create(BDStudentPunishment student){
        this.students.add(student);
        return student;
    }

    public BDStudentPunishment read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public BDStudentPunishment update(BDStudentPunishment student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<BDStudentPunishment> getAll(){
        return this.students;
    }
}
