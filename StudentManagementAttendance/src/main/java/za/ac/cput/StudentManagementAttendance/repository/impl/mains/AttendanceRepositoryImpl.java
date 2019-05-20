package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AttendanceRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AttendanceRepositoryImpl implements AttendanceRepository {

    private static AttendanceRepositoryImpl repository = null;
    private Map<String, Attendance> attendances;

    private AttendanceRepositoryImpl() {
        this.attendances = (Map<String, Attendance>) new HashSet<>();
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
