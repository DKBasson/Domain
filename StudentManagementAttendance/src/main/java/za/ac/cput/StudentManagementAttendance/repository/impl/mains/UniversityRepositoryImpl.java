package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import org.springframework.stereotype.Repository;
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.SubjectRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.UniversityRepository;

import java.util.*;

public class UniversityRepositoryImpl implements UniversityRepository {

    private static UniversityRepositoryImpl repository = null;
    private Map<String, University> students;

    private UniversityRepositoryImpl() {
        this.students =  new HashMap<>();
    }

    public static UniversityRepository getRepository(){
        if(repository == null) repository = new UniversityRepositoryImpl();
        return repository;
    }

    public University create(University student){
        this.students.put(student.getUniversityID(), student);
        return student;
    }

    public University read(String studentId){
        return this.students.get(studentId);
    }

    public University update(University student) {
        this.students.replace(student.getUniversityID(), student);
        return this.students.get(student.getUniversityID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<University> getAll(){
        Collection<University> students = this.students.values();
        Set<University> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}
