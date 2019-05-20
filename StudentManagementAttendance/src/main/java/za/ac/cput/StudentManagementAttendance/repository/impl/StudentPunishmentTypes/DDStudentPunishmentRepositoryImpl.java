package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.DDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class DDStudentPunishmentRepositoryImpl implements DDStudentPunishmentRepository {

    private static DDStudentPunishmentRepositoryImpl repository = null;
    private Set<DDStudentPunishment> students;

    private DDStudentPunishmentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static DDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new DDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public DDStudentPunishment create(DDStudentPunishment student){
        this.students.add(student);
        return student;
    }

    public DDStudentPunishment read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public DDStudentPunishment update(DDStudentPunishment student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<DDStudentPunishment> getAll(){
        return this.students;
    }
}
