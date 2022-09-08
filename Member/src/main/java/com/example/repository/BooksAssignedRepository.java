package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.BookAssigned;

public interface BooksAssignedRepository extends CrudRepository<BookAssigned,Integer> {

}
