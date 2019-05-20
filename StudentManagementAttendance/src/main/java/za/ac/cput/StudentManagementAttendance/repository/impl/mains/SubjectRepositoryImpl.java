package za.ac.cput.StudentManagementAttendance.repository.impl.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentSponsorRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.SubjectRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubjectRepositoryImpl implements SubjectRepository {

    private static SubjectRepositoryImpl repository = null;
    private Map<String, Subject> students;

    private SubjectRepositoryImpl() {
        this.students = (Map<String, Subject>) new HashSet<>();
    }

    public static SubjectRepository getRepository(){
        if(repository == null) repository = new SubjectRepositoryImpl();
        return repository;
    }

    public Subject create(Subject student){
        this.students.put(student.getSubjectID(), student);
        return student;
    }

    public Subject read(String studentId){
        return this.students.get(studentId);
    }

    public Subject update(Subject student) {
        this.students.replace(student.getSubjectID(), student);
        return this.students.get(student.getSubjectID());
    }

    public void delete(String studentId) {
        this.students.remove(studentId);

    }

    public Set<Subject> getAll(){
        Collection<Subject> students = this.students.values();
        Set<Subject> set = new HashSet<>();
        set.addAll(students);
        return set;
    }}
