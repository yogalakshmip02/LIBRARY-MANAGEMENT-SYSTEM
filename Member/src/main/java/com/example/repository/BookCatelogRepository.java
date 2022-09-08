package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Book;

public interface BookCatelogRepository extends CrudRepository<Book,String> {

}
