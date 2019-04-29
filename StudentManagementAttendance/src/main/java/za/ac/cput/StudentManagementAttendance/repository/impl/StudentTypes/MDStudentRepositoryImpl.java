package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class MDStudentRepositoryImpl implements MDStudentRepository {

    private static MDStudentRepository repository = null;
    private Set<MDStudent> mdStudents;

    private MDStudentRepositoryImpl() {
        this.mdStudents = new HashSet<>();
    }

    public static MDStudentRepository getRepository(){
        if(repository == null) repository = new MDStudentRepositoryImpl();
        return repository;
    }

    public MDStudent create(MDStudent student){
        this.mdStudents.add(student);
        return student;
    }

    public MDStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public MDStudent update(MDStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<MDStudent> getAll(){
        return this.mdStudents;
    }
}
