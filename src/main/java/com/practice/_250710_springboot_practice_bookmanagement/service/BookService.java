package com.practice._250710_springboot_practice_bookmanagement.service;

import com.practice._250710_springboot_practice_bookmanagement.model.Book;
import com.practice._250710_springboot_practice_bookmanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    public Book getById(Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new NoSuchElementException("책 없음"));
    }
    public Book create(Book book) {
        return bookRepository.save(book);
    }
}
