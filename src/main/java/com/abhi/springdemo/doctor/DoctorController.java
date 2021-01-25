package com.abhi.springdemo.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
    @Autowired
    private DoctorServic doctorServic;

    @GetMapping(path = "/doctors")
    public ResponseEntity<List<DoctorEntity>> listAllEntity(){
        ResponseEntity<List<DoctorEntity>> responseEntity = new ResponseEntity<List<DoctorEntity>>(doctorServic.listAllEntity(), HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping(path = "/doctors/{id}")
    public ResponseEntity<DoctorEntity> findEntityById(@PathVariable Long id){
        ResponseEntity<DoctorEntity> responseEntity = null;
        DoctorEntity entity = doctorServic.findEntityById(id);
        if(entity != null){
            responseEntity = new ResponseEntity<DoctorEntity>(entity, HttpStatus.OK);
        }else{
            throw new EntityNotFoundException("Entity with id " + id + " not found");
        }
        return responseEntity;
    }

    @PostMapping(path = "/doctors")
    public ResponseEntity<?> addEntity(@Valid @RequestBody DoctorEntity entity){
        ResponseEntity<DoctorEntity> responseEntity = new ResponseEntity<DoctorEntity>(doctorServic.addEntity(entity), HttpStatus.CREATED);
        return responseEntity;
    }

    @PutMapping(path = "/doctors")
    public ResponseEntity<?> editEntity(){
        return null;
    }

    @DeleteMapping(path = "/doctors/{id}")
    public ResponseEntity<?> deleteEntityById(@PathVariable Long id){

        ResponseEntity<DoctorEntity> responseEntity = null;
        DoctorEntity entity = doctorServic.deleteEntityById(id);
        if(entity != null){
            responseEntity = new ResponseEntity<DoctorEntity>(entity, HttpStatus.OK);
        }else{
            throw new EntityNotFoundException("Entity with id " + id + " not found");
        }
        return responseEntity;
    }

}
