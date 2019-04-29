package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentSponsorRepository;

import java.util.HashSet;
import java.util.Set;

public class StudentSponsorRepositoryImpl implements StudentSponsorRepository {

    private static StudentSponsorRepositoryImpl repository = null;
    private Set<StudentSponsor> studentSponsors;

    private StudentSponsorRepositoryImpl() {
        this.studentSponsors = new HashSet<>();
    }

    public static StudentSponsorRepository getRepository(){
        if(repository == null) repository = new StudentSponsorRepositoryImpl();
        return repository;
    }

    public StudentSponsor create(StudentSponsor student){
        this.studentSponsors.add(student);
        return student;
    }

    public StudentSponsor read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public StudentSponsor update(StudentSponsor student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<StudentSponsor> getAll(){
        return this.studentSponsors;
    }
}
