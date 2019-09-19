package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.University;
import za.ac.cput.repository.users.UniversityRepository;
import za.ac.cput.repository.users.impl.UniversityRepositoryImpl;
import za.ac.cput.service.users.UniversityService;

import java.util.HashSet;
import java.util.Set;

@Repository("UniversityServiceImpl")
public class UniversityServiceImpl implements UniversityService {

    private UniversityServiceImpl service = null;
    private UniversityRepository repository;

    public UniversityServiceImpl() {
        repository = UniversityRepositoryImpl.getRepository();
    }

    public UniversityServiceImpl getService(){

        if(service == null){
            return new UniversityServiceImpl();
        }
        return service;
    }

    @Override
    public Set<University> getAll() {
        return this.repository.getAll();
    }

    @Override
    public University create(University university) {
        return repository.create(university);
    }

    @Override
    public University read(String integer) {
        return repository.read(integer);
    }

    @Override
    public University update(University university) {
        return repository.update(university);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

