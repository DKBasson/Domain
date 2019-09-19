package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.repository.users.HODRepository;
import za.ac.cput.repository.users.impl.HODRepositoryImpl;
import za.ac.cput.service.users.HODService;

import java.util.HashSet;
import java.util.Set;

@Repository("HODServiceImpl")
public class HODServiceImpl implements HODService {

    private HODServiceImpl service = null;
    private HODRepository repository;

    public HODServiceImpl() {
        repository = HODRepositoryImpl.getRepository();
    }

    public HODServiceImpl getService(){

        if(service == null){
            return new HODServiceImpl();
        }
        return service;
    }

    @Override
    public Set<HOD> getAll() {
        return this.repository.getAll();
    }

    @Override
    public HOD create(HOD hod) {
        return repository.create(hod);
    }

    @Override
    public HOD read(String integer) {
        return repository.read(integer);
    }

    @Override
    public HOD update(HOD hod) {
        return repository.update(hod);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

