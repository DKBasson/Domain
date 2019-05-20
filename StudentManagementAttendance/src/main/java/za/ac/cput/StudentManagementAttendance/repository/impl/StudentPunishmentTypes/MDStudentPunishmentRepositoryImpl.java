package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.MDStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class MDStudentPunishmentRepositoryImpl implements MDStudentPunishmentRepository {

    private static MDStudentPunishmentRepositoryImpl repository = null;
    private Set<MDStudentPunishment> students;

    private MDStudentPunishmentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static MDStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new MDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public MDStudentPunishment create(MDStudentPunishment student){
        this.students.add(student);
        return student;
    }

    public MDStudentPunishment read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public MDStudentPunishment update(MDStudentPunishment student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<MDStudentPunishment> getAll(){
        return this.students;
    }
}
