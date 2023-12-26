package icesi.edu.co.LibrarySystem.LibrarySystem.persistence.repositories;

import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository {
    Optional<Book> findById(Long id);
    Book save(Book book);

    List<Book> getAll();
    void delete(Book book);
}
