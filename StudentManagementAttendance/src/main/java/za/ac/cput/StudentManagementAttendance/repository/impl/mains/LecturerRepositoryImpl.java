package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.LecturerRepository;

import java.util.*;
@Repository("LecturerRepository")
public class LecturerRepositoryImpl implements LecturerRepository {

    private static LecturerRepositoryImpl repository = null;
    private Map<String, Lecturer> lecturers;

    private LecturerRepositoryImpl() {
        this.lecturers =  new HashMap<>();
    }

    public static LecturerRepository getRepository(){
        if(repository == null) repository = new LecturerRepositoryImpl();
        return repository;
    }

    public Lecturer create(Lecturer student){
        this.lecturers.put(student.getStaffID(), student);
        return student;
    }

    public Lecturer read(String studentId){
        return this.lecturers.get(studentId);
    }

    public Lecturer update(Lecturer student) {
        this.lecturers.replace(student.getStaffID(), student);
        return this.lecturers.get(student.getStaffID());
    }

    public void delete(String studentId) {
        this.lecturers.remove(studentId);

    }

    public Set<Lecturer> getAll(){
        Collection<Lecturer> lecturers = this.lecturers.values();
        Set<Lecturer> set = new HashSet<>();
        set.addAll(lecturers);
        return set;
    }}
