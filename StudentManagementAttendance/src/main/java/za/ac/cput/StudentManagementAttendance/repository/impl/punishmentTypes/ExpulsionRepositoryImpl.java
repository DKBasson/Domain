package za.ac.cput.StudentManagementAttendance.repository.impl.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.VenueRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.VenueRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes.ExpulsionRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExpulsionRepositoryImpl implements ExpulsionRepository {

    private static ExpulsionRepositoryImpl repository = null;
    private Map<String, Expulsion> students;

    private ExpulsionRepositoryImpl() {
        this.students = (Map<String, Expulsion>) new HashSet<>();
    }

    public static ExpulsionRepository getRepository(){
        if(repository == null) repository = new ExpulsionRepositoryImpl();
        return repository;
    }

    public Expulsion create(Expulsion student){
        this.students.put(student.getStudentID(), student);
        return student;
    }

    public Expulsion read(String studentId){
        return this.students.get(studentId);
    }

    public Expulsion update(Expulsion student) {
        this.students.replace(student.getStudentID(), student);
        return this.students.get(student.getStudentID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Expulsion> getAll(){
        Collection<Expulsion> students = this.students.values();
        Set<Expulsion> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}

