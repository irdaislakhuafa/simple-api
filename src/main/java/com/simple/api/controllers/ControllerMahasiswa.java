package com.simple.api.controllers;

import com.simple.api.Model.entities.Mahasiswa;
import com.simple.api.helpers.ResponseMessage;
import com.simple.api.services.ServiceMahasiswa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/learn-reactjs/simpleapi/mahasiswa")
public class ControllerMahasiswa {

    @Autowired
    private ServiceMahasiswa serviceMahasiswa;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Mahasiswa mahasiswa) {
        ResponseMessage<Mahasiswa> respone = new ResponseMessage<>();
        respone.setStatus(HttpStatus.OK.toString());
        respone.setValues(serviceMahasiswa.save(mahasiswa));
        return ResponseEntity.ok(respone);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        ResponseMessage<Iterable<Mahasiswa>> response = new ResponseMessage<>();

        response.setStatus(HttpStatus.OK.toString());
        response.setValues(serviceMahasiswa.findAll());
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idMahasiswa) {
        Mahasiswa mahasiswa = serviceMahasiswa.findById(idMahasiswa).get();
        ResponseMessage<Mahasiswa> response = new ResponseMessage<Mahasiswa>(HttpStatus.OK.toString(), mahasiswa);
        return ResponseEntity.ok(response);
    }
}
