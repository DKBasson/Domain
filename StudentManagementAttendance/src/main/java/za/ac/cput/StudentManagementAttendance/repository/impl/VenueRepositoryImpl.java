package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.University;
import za.ac.cput.StudentManagementAttendance.domain.Venue;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.UniversityRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.VenueRepository;

import java.util.HashSet;
import java.util.Set;

public class VenueRepositoryImpl implements VenueRepository {

    private static VenueRepositoryImpl repository = null;
    private Set<Venue> venues;

    private VenueRepositoryImpl() {
        this.venues = new HashSet<>();
    }

    public static VenueRepository getRepository(){
        if(repository == null) repository = new VenueRepositoryImpl();
        return repository;
    }

    public Venue create(Venue student){
        this.venues.add(student);
        return student;
    }

    public Venue read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Venue update(Venue student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Venue> getAll(){
        return this.venues;
    }
}
