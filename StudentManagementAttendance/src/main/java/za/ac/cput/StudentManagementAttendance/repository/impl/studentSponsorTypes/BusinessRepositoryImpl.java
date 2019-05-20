package za.ac.cput.StudentManagementAttendance.repository.impl.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes.BusinessRepository;

import java.util.HashSet;
import java.util.Set;

public class BusinessRepositoryImpl implements BusinessRepository {

    private static BusinessRepositoryImpl repository = null;
    private Set<Business> students;

    private BusinessRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static BusinessRepository getRepository(){
        if(repository == null) repository = new BusinessRepositoryImpl();
        return repository;
    }

    public Business create(Business student){
        this.students.add(student);
        return student;
    }

    public Business read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Business update(Business student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Business> getAll(){
        return this.students;
    }
}
