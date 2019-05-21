package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AttendanceRepository;

import java.util.*;

public class AttendanceRepositoryImpl implements AttendanceRepository {

    private static AttendanceRepositoryImpl repository = null;
    private Map<String, Attendance> attendances;

    private AttendanceRepositoryImpl() {
        this.attendances = new HashMap<>();
    }

    public static AttendanceRepository getRepository(){
        if(repository == null) repository = new AttendanceRepositoryImpl();
        return repository;
    }

    public Attendance create(Attendance student){
        this.attendances.put(student.getStudentID(), student);
        return student;
    }

    public Attendance read(String studentId){
      return this.attendances.get(studentId);
    }

    public Attendance update(Attendance student) {
        this.attendances.replace(student.getStudentID(), student);
        return this.attendances.get(student.getStudentID());
    }

    public void delete(String studentId) {
        this.attendances.remove(studentId);

    }

    public Set<Attendance> getAll(){
        Collection<Attendance> attendances = this.attendances.values();
        Set<Attendance> set = new HashSet<>();
        set.addAll(attendances);
        return set;
    }}
