package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.BookStatus;


public interface BookStatusRepository extends CrudRepository<BookStatus,Integer>{

}
