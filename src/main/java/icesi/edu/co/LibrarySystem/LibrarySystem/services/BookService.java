package icesi.edu.co.LibrarySystem.LibrarySystem.services;

import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Long id);

    Book save(Book book);

    List<Book> getAll();

    void delete(Book book);
}
