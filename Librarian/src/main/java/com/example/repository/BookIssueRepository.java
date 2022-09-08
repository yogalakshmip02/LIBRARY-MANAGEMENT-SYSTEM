package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.BookIssue;


public interface BookIssueRepository extends CrudRepository<BookIssue,Integer>{

}
