package za.ac.cput.StudentManagementAttendance.controller.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AdministratorRepository;

import java.util.*;

public class AdministratorController implements AdministratorRepository {

    private static AdministratorController repository = null;
    private Map<String, Administrator> administrators;

    private AdministratorController() {
        this.administrators = new HashMap<>();
    }

    public static AdministratorRepository getRepository(){
        if(repository == null) repository = new AdministratorController();
        return repository;
    }

    public Administrator create(Administrator student){
        this.administrators.put(student.getStaffID(), student);
        return student;
    }

    public Administrator read(String studentId){
       return this.administrators.get(studentId);
    }

    public Administrator update(Administrator student) {
        this.administrators.replace(student.getStaffID(), student);
        return this.administrators.get(student.getStaffID());
    }

    public void delete(String studentId) {
    this.administrators.remove(studentId);
    }

    public Set<Administrator> getAll(){
        Collection<Administrator> administrators = this.administrators.values();
        Set<Administrator> set = new HashSet<>();
        set.addAll(administrators);
        return set;
    }
}
