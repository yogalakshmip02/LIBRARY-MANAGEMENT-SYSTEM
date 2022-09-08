package com.example.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbo.Bookdbo;
import com.example.dbo.Categorydbo;
import com.example.entity.Book;
import com.example.entity.Category;
import com.example.exception.LibrarianException;
import com.example.repository.BookCatelogRepository;
import com.example.repository.CategoryRepository;


@Service(value="bookCatelogService")
public class BookCatelogServiceImpl {
@Autowired
private BookCatelogRepository bookRepository;

@Autowired
private CategoryRepository categoryRepository;

public Categorydbo getCategorydetails(String categoryName)throws LibrarianException
{
	Optional<Category> optional = categoryRepository.findById(categoryName);
	Category customer = optional.orElseThrow(()->new LibrarianException("Service.CATEGORY_NOT_FOUND"));
	Categorydbo customerDTO = new Categorydbo();	
	customerDTO.setCategory(customer.getCategory());
	
	
	
	List<Book> cards = customer.getBook();
	List<Bookdbo> cardDTOs = new LinkedList<>();
	
	
	if (!cards.isEmpty()) {
		cardDTOs = cards.stream()
				.map(c->new Bookdbo(c.getBookId(),c.getBookName()))
				.collect(Collectors.toList());
	}
	customerDTO.setBook(cardDTOs);
	return customerDTO;
	
}
}
