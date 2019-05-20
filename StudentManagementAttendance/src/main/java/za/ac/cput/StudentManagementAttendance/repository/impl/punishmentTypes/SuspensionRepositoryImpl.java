package za.ac.cput.StudentManagementAttendance.repository.impl.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.SuspensionRepository;

import java.util.HashSet;
import java.util.Set;

public class SuspensionRepositoryImpl implements SuspensionRepository {

    private static SuspensionRepositoryImpl repository = null;
    private Set<Suspension> students;

    private SuspensionRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static SuspensionRepository getRepository(){
        if(repository == null) repository = new SuspensionRepositoryImpl();
        return repository;
    }

    public Suspension create(Suspension student){
        this.students.add(student);
        return student;
    }

    public Suspension read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Suspension update(Suspension student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Suspension> getAll(){
        return this.students;
    }
}
