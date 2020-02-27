package com.example.BookStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BookStore.domain.Book;

@Controller
public class BookController {
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String bookList(Model model) {
		
		return "book";
	}
}
