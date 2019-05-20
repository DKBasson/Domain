package za.ac.cput.StudentManagementAttendance.repository.impl.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.ExpulsionRepository;

import java.util.HashSet;
import java.util.Set;

public class ExpulsionRepositoryImpl implements ExpulsionRepository {

    private static ExpulsionRepositoryImpl repository = null;
    private Set<Expulsion> expulsions;

    private ExpulsionRepositoryImpl() {
        this.expulsions = new HashSet<>();
    }

    public static ExpulsionRepository getRepository(){
        if(repository == null) repository = new ExpulsionRepositoryImpl();
        return repository;
    }

    public Expulsion create(Expulsion student){
        this.expulsions.add(student);
        return student;
    }

    public Expulsion read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Expulsion update(Expulsion student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Expulsion> getAll(){
        return this.expulsions;
    }
}
