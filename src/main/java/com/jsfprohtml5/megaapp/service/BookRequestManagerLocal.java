/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfprohtml5.megaapp.service;

import com.jsfprohtml5.megaapp.model.BookRequest;
import com.jsfprohtml5.megaapp.service.exception.BookRequestAlreadyExists;
import com.jsfprohtml5.megaapp.service.exception.BookRequestNotFound;
import java.util.List;
import javax.ejb.Local;

@Local
public interface BookRequestManagerLocal {

    public BookRequest sendBookRequest(BookRequest bookRequest) throws BookRequestAlreadyExists;

    public void approveBookRequest(Integer bookRequestNumber) throws BookRequestNotFound;

    public void rejectBookRequest(Integer bookRequestNumber) throws BookRequestNotFound;

    public List<BookRequest> viewRequests(String userName, int status);
}
