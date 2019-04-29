package za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.DDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;

import java.util.HashSet;
import java.util.Set;

public class DDStudentRepositoryImpl implements DDStudentRepository {

    private static DDStudentRepository repository = null;
    private Set<DDStudent> ddStudents;

    private DDStudentRepositoryImpl() {
        this.ddStudents = new HashSet<>();
    }

    public static DDStudentRepository getRepository(){
        if(repository == null) repository = new DDStudentRepositoryImpl();
        return repository;
    }

    public DDStudent create(DDStudent student){
        this.ddStudents.add(student);
        return student;
    }

    public DDStudent read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public DDStudent update(DDStudent student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<DDStudent> getAll(){
        return this.ddStudents;
    }
}
