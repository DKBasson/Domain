package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentSponsorRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentSponsorRepositoryImpl implements StudentSponsorRepository {

    private static StudentSponsorRepositoryImpl repository = null;
    private Map<String, StudentSponsor> students;

    private StudentSponsorRepositoryImpl() {
        this.students = (Map<String, StudentSponsor>) new HashSet<>();
    }

    public static StudentSponsorRepository getRepository(){
        if(repository == null) repository = new StudentSponsorRepositoryImpl();
        return repository;
    }

    public StudentSponsor create(StudentSponsor student){
        this.students.put(student.getSponsorNum(), student);
        return student;
    }

    public StudentSponsor read(String studentId){
        return this.students.get(studentId);
    }

    public StudentSponsor update(StudentSponsor student) {
        this.students.replace(student.getSponsorNum(), student);
        return this.students.get(student.getSponsorNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<StudentSponsor> getAll(){
        Collection<StudentSponsor> students = this.students.values();
        Set<StudentSponsor> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}
