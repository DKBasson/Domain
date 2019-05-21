package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.UniversityRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.VenueRepository;

import java.util.*;

public class VenueRepositoryImpl implements VenueRepository {

    private static VenueRepositoryImpl repository = null;
    private Map<String, Venue> students;

    private VenueRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static VenueRepository getRepository(){
        if(repository == null) repository = new VenueRepositoryImpl();
        return repository;
    }

    public Venue create(Venue student){
        this.students.put(student.getVenueNumber(), student);
        return student;
    }

    public Venue read(String studentId){
        return this.students.get(studentId);
    }

    public Venue update(Venue student) {
        this.students.replace(student.getVenueNumber(), student);
        return this.students.get(student.getVenueNumber());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Venue> getAll(){
        Collection<Venue> students = this.students.values();
        Set<Venue> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}
