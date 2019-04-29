package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class BDStudentRepositoryImpl implements BDStudentRepository {

    private static BDStudentRepository repository = null;
    private Set<BDStudent> bdStudents;

    private BDStudentRepositoryImpl() {
        this.bdStudents = new HashSet<>();
    }

    public static BDStudentRepository getRepository(){
        if(repository == null) repository = new BDStudentRepositoryImpl();
        return repository;
    }

    public BDStudent create(BDStudent student){
        this.bdStudents.add(student);
        return student;
    }

    public BDStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public BDStudent update(BDStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<BDStudent> getAll(){
        return this.bdStudents;
    }
}
