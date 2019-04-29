package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.PunishmentIfBunkedAlotRepository;

import java.util.HashSet;
import java.util.Set;

public class PunishmentIfBunkedAlotRepositoryImpl implements PunishmentIfBunkedAlotRepository {

    private static PunishmentIfBunkedAlotRepositoryImpl repository = null;
    private Set<PunishmentIfBunkedAlot> punishmentIfBunkedAlots;

    private PunishmentIfBunkedAlotRepositoryImpl() {
        this.punishmentIfBunkedAlots = new HashSet<>();
    }

    public static PunishmentIfBunkedAlotRepository getRepository(){
        if(repository == null) repository = new PunishmentIfBunkedAlotRepositoryImpl();
        return repository;
    }

    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot student){
        this.punishmentIfBunkedAlots.add(student);
        return student;
    }

    public PunishmentIfBunkedAlot read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<PunishmentIfBunkedAlot> getAll(){
        return this.punishmentIfBunkedAlots;
    }
}
