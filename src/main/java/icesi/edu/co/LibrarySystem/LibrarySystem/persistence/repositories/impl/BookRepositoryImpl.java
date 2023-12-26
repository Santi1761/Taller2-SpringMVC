package icesi.edu.co.LibrarySystem.LibrarySystem.persistence.repositories.impl;


import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.repositories.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private final List<Book> books = new ArrayList<>();

    public BookRepositoryImpl() {
        super();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return books.stream().filter(p->p.getId() == id).findFirst();
    }

    public List<Book> getAll(){
        return books;
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }

    @Override
    public Book save(Book book) {
        Book existingProject = findById(book.getId()).orElse(null);
        if (existingProject == null) {
            books.add(book);
        } else {
            books.remove(existingProject);
            Book newBook = new Book(book);
            books.add(newBook);
        }
        return book;
    }

}
