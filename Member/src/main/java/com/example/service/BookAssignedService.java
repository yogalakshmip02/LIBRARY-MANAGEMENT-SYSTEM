package com.example.service;

import com.example.dbo.BooksAssigneddbo;
import com.example.exception.LibrarianException;

public interface BookAssignedService {

public BooksAssigneddbo getBookAssigned(Integer memberCode) throws LibrarianException;
}
