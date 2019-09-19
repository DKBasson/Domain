package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.University;
import za.ac.cput.repository.users.UniversityRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("UniversityInMemory")
public class UniversityRepositoryImpl implements UniversityRepository {

    private static UniversityRepositoryImpl repository = null;
    private Set<University> universitys;

    public UniversityRepositoryImpl(){
        universitys = new HashSet<>();
    }


    public static UniversityRepositoryImpl getRepository() {

        if(repository == null){
            return new UniversityRepositoryImpl();
        }
        return repository;
    }

    @Override
    public University create(University university) {

        universitys.add(university);
        return university;
    }

    @Override
    public University read(String id) {

        return universitys.stream().filter(university -> university.getUniversityID().equals(id)).findAny().orElse(null);
    }

    @Override
    public University update(University university) {

        University inDB = read(university.getUniversityID());

        if(inDB != null){
            universitys.remove(inDB);
            universitys.add(university);
            return university;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        University inDB = read(id);
        universitys.remove(inDB);

    }

    @Override
    public Set<University> getAll() {
        return universitys;
    }

}

