package com.example.service;

import com.example.dbo.RaiseRequestdbo;
import com.example.exception.LibrarianException;

public interface RaiseRequestService {

	Integer raiseRequest(RaiseRequestdbo raise) throws LibrarianException;

}
