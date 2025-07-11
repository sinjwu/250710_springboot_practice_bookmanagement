package com.practice._250710_springboot_practice_bookmanagement.service;

import com.practice._250710_springboot_practice_bookmanagement.model.Author;
import com.practice._250710_springboot_practice_bookmanagement.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
    public Author getById(Integer id) {
        return authorRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("저자 없음"));
    }
    public Author create(Author author) {
        return authorRepository.save(author);
    }
    public Author update(Integer id, Author updatedAuthor) {
        return authorRepository.update(id, updatedAuthor);
    }
    public void delete(Integer id) {
        authorRepository.delete(id);
    }
}
