package com.simple.api.Model.dao;

import com.simple.api.Model.entities.Mahasiswa;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DaoMahasiswa extends PagingAndSortingRepository<Mahasiswa, Long> {

}
