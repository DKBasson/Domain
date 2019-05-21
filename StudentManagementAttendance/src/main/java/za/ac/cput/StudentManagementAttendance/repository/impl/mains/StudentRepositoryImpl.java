package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PunishmentIfBunkedAlotRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.*;
@Repository("InMemory")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Map<String, Student> students;

    private StudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }

    public Student create(Student student){
        this.students.put(student.getSsStudentNum(), student);
        return student;
    }

    public Student read(String studentId){
        return this.students.get(studentId);
    }

    public Student update(Student student) {
        this.students.replace(student.getSsStudentNum(), student);
        return this.students.get(student.getSsStudentNum());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Student> getAll(){
        Collection<Student> students = this.students.values();
        Set<Student> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}
