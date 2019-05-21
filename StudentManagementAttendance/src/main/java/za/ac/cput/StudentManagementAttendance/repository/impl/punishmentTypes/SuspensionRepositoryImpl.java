package za.ac.cput.StudentManagementAttendance.repository.impl.punishmentTypes;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.ExpulsionRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.SuspensionRepository;

import java.util.*;
@Repository("SuspensionRepository")
public class SuspensionRepositoryImpl implements SuspensionRepository {

    private static SuspensionRepositoryImpl repository = null;
    private Map<String, Suspension> students;

    private SuspensionRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static SuspensionRepository getRepository(){
        if(repository == null) repository = new SuspensionRepositoryImpl();
        return repository;
    }

    public Suspension create(Suspension student){
        this.students.put(student.getStudentID(), student);
        return student;
    }

    public Suspension read(String studentId){
        return this.students.get(studentId);
    }

    public Suspension update(Suspension student) {
        this.students.replace(student.getStudentID(), student);
        return this.students.get(student.getStudentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Suspension> getAll(){
        Collection<Suspension> students = this.students.values();
        Set<Suspension> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

