package icesi.edu.co.LibrarySystem.LibrarySystem.services.impl;

import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.BeanA;
import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.repositories.BookRepository;
import icesi.edu.co.LibrarySystem.LibrarySystem.services.BookService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceimpl implements BookService {
    private static Logger log = LoggerFactory.getLogger(BeanA.class);

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void post(){
        log.info("Método postconstruct llamado service");
    }
}
