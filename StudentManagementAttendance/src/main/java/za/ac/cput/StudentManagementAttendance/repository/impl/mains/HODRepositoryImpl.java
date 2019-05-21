package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.HODRepository;

import java.util.*;

public class HODRepositoryImpl implements HODRepository {

    private static HODRepositoryImpl repository = null;
    private Map<String, HOD> hodss;

    private HODRepositoryImpl() {
        this.hodss = new HashMap<>();
    }

    public static HODRepository getRepository(){
        if(repository == null) repository = new HODRepositoryImpl();
        return repository;
    }

    public HOD create(HOD student){
        this.hodss.put(student.getMemberID(), student);
        return student;
    }

    public HOD read(String studentId){
        return this.hodss.get(studentId);
    }

    public HOD update(HOD student) {
        this.hodss.replace(student.getMemberID(), student);
        return this.hodss.get(student.getMemberID());
    }

    public void delete(String studentId) {
        this.hodss.remove(studentId);

    }

    public Set<HOD> getAll(){
        Collection<HOD> hodss = this.hodss.values();
        Set<HOD> set = new HashSet<>();
        set.addAll(hodss);
        return set;
    }}
