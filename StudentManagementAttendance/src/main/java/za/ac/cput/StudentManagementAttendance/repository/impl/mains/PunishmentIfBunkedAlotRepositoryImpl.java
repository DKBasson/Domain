package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PersonRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PunishmentIfBunkedAlotRepository;

import java.util.*;

public class PunishmentIfBunkedAlotRepositoryImpl implements PunishmentIfBunkedAlotRepository {

    private static PunishmentIfBunkedAlotRepositoryImpl repository = null;
    private Map<String, PunishmentIfBunkedAlot> punishments;

    private PunishmentIfBunkedAlotRepositoryImpl() {
        this.punishments = new HashMap<>();
    }

    public static PunishmentIfBunkedAlotRepository getRepository(){
        if(repository == null) repository = new PunishmentIfBunkedAlotRepositoryImpl();
        return repository;
    }

    public PunishmentIfBunkedAlot create(PunishmentIfBunkedAlot student){
        this.punishments.put(student.getStudentID(), student);
        return student;
    }

    public PunishmentIfBunkedAlot read(String studentId){
        return this.punishments.get(studentId);
    }

    public PunishmentIfBunkedAlot update(PunishmentIfBunkedAlot student) {
        this.punishments.replace(student.getStudentID(), student);
        return this.punishments.get(student.getStudentID());
    }

    public void delete(String studentId) {
        this.punishments.remove(studentId);

    }

    public Set<PunishmentIfBunkedAlot> getAll(){
        Collection<PunishmentIfBunkedAlot> punishments = this.punishments.values();
        Set<PunishmentIfBunkedAlot> set = new HashSet<>();
        set.addAll(punishments);
        return set;
    }}
