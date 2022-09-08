package com.example.service;

import com.example.dbo.Reportsdbo;
import com.example.exception.LibrarianException;

public interface ReportsService  {

	Integer addMember(Reportsdbo regdbo) throws LibrarianException;

}
