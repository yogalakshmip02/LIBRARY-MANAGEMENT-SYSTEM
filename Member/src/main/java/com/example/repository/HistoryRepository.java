package com.example.repository;

import com.example.entity.History;

public interface HistoryRepository {

	Iterable<History> findAll();
    
	

}
