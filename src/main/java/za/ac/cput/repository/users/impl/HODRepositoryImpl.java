package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.repository.users.HODRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("HODInMemory")
public class HODRepositoryImpl implements HODRepository {

    private static HODRepositoryImpl repository = null;
    private Set<HOD> hods;

    public HODRepositoryImpl(){
        hods = new HashSet<>();
    }


    public static HODRepositoryImpl getRepository() {

        if(repository == null){
            return new HODRepositoryImpl();
        }
        return repository;
    }

    @Override
    public HOD create(HOD hod) {

        hods.add(hod);
        return hod;
    }

    @Override
    public HOD read(String id) {

        return hods.stream().filter(hod -> hod.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public HOD update(HOD hod) {

        HOD inDB = read(hod.getUserID());

        if(inDB != null){
            hods.remove(inDB);
            hods.add(hod);
            return hod;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        HOD inDB = read(id);
        hods.remove(inDB);

    }

    @Override
    public Set<HOD> getAll() {
        return hods;
    }

}

