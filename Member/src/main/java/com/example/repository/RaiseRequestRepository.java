package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.RaiseRequest;

public interface RaiseRequestRepository extends CrudRepository<RaiseRequest,Integer> {

}
