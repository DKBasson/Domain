package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class ADStudentRepositoryImpl implements ADStudentRepository {

    private static ADStudentRepository repository = null;
    private Set<ADStudent> adStudents;

    private ADStudentRepositoryImpl() {
        this.adStudents = new HashSet<>();
    }

    public static ADStudentRepository getRepository(){
        if(repository == null) repository = new ADStudentRepositoryImpl();
        return repository;
    }

    public ADStudent create(ADStudent student){
        this.adStudents.add(student);
        return student;
    }

    public ADStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public ADStudent update(ADStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<ADStudent> getAll(){
        return this.adStudents;
    }
}
