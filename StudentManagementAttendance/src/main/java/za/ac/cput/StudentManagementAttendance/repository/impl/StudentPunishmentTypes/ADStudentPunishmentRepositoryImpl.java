package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes.ADStudentPunishmentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class ADStudentPunishmentRepositoryImpl implements ADStudentPunishmentRepository {

    private static ADStudentPunishmentRepositoryImpl repository = null;
    private Set<ADStudentPunishment> students;

    private ADStudentPunishmentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static ADStudentPunishmentRepository getRepository(){
        if(repository == null) repository = new ADStudentPunishmentRepositoryImpl();
        return repository;
    }

    public ADStudentPunishment create(ADStudentPunishment student){
        this.students.add(student);
        return student;
    }

    public ADStudentPunishment read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public ADStudentPunishment update(ADStudentPunishment student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<ADStudentPunishment> getAll(){
        return this.students;
    }
}
