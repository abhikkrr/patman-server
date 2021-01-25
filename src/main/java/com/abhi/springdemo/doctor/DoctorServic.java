package com.abhi.springdemo.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServic {
    @Autowired
    private DoctorRepo doctorRepo;

    public List<DoctorEntity> listAllEntity(){

        return doctorRepo.findAll();
    }

    public DoctorEntity findByName(String name) {

        return null;
    }

    public DoctorEntity findEntityById(Long id) {

        return doctorRepo.findById(id).get();
    }

    public DoctorEntity addEntity(DoctorEntity entity) {

        return doctorRepo.saveAndFlush(entity);
    }

    public DoctorEntity deleteEntityById(Long id) {
        DoctorEntity entity = findEntityById(id);
        if(entity != null){
            doctorRepo.deleteById(id);
            return entity;
        }
        return null;
    }




}
