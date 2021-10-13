package com.simple.api.services;

import java.util.Optional;

import com.simple.api.Model.dao.DaoMahasiswa;
import com.simple.api.Model.entities.Mahasiswa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMahasiswa {

    @Autowired
    private DaoMahasiswa daoMahasiswa;

    public Optional<Mahasiswa> findById(Long id) {
        return daoMahasiswa.findById(id);
    }

    public Iterable<Mahasiswa> findAll() {
        return daoMahasiswa.findAll();
    }

    public Mahasiswa save(Mahasiswa mahasiswa) {
        return daoMahasiswa.save(mahasiswa);
    }

    public void removeById(Long id) {
        daoMahasiswa.deleteById(id);
    }

}
