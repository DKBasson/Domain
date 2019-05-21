package za.ac.cput.StudentManagementAttendance.repository.impl.studentSponsorTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.repository.impl.studentCommands.removeStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands.removeStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.BusinessRepository;

import java.util.*;

public class BusinessRepositoryImpl implements BusinessRepository {

    private static BusinessRepositoryImpl repository = null;
    private Map<String, Business> students;

    private BusinessRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static BusinessRepository getRepository(){
        if(repository == null) repository = new BusinessRepositoryImpl();
        return repository;
    }

    public Business create(Business student){
        this.students.put(student.getSponsorNum(), student);
        return student;
    }

    public Business read(String studentId){
        return this.students.get(studentId);
    }

    public Business update(Business student) {
        this.students.replace(student.getSponsorNum(), student);
        return this.students.get(student.getSponsorNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Business> getAll(){
        Collection<Business> students = this.students.values();
        Set<Business> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}


