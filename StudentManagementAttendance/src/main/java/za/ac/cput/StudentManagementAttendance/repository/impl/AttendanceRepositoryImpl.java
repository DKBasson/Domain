package za.ac.cput.StudentManagementAttendance.repository.impl;

import za.ac.cput.StudentManagementAttendance.domain.Attendance;
import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.AttendanceRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.HODRepository;

import java.util.HashSet;
import java.util.Set;

public class AttendanceRepositoryImpl implements AttendanceRepository {

    private static AttendanceRepositoryImpl repository = null;
    private Set<Attendance> attendances;

    private AttendanceRepositoryImpl() {
        this.attendances = new HashSet<>();
    }

    public static AttendanceRepository getRepository(){
        if(repository == null) repository = new AttendanceRepositoryImpl();
        return repository;
    }

    public Attendance create(Attendance student){
        this.attendances.add(student);
        return student;
    }

    public Attendance read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Attendance update(Attendance student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Attendance> getAll(){
        return this.attendances;
    }
}
