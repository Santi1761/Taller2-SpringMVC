package icesi.edu.co.LibrarySystem.LibrarySystem.controllers;

import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.LibrarySystem.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
        bookService.save(new Book(1L, "El Gran Gatsby", "Editorial XYZ", "F. Scott Fitzgerald", 19.99, 50L));
        bookService.save(new Book(2L, "Matar a un ruiseñor", "HarperCollins", "Harper Lee", 15.99, 30L));
        bookService.save(new Book(3L, "1984", "Penguin Books", "George Orwell", 12.50, 40L));
        bookService.save(new Book(4L, "Cien años de soledad", "Editorial Sudamericana", "Gabriel García Márquez", 18.75, 25L));
    }

    @GetMapping("")
    public String findAll(Model model){
        List<Book> books = this.bookService.getAll();
        System.out.println(books);
        model.addAttribute( "books", books);

        return "books/index";
    }

    @GetMapping("/{id}")
    public String findOne(Model model, @PathVariable Long id){
        if(this.bookService.findById(id).isPresent()) {
            Book book = this.bookService.findById(id).get();
            model.addAttribute(book);
            return "books/detail";
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }

    @GetMapping("/{id}/edit")
    public String editForm(Model model, @PathVariable Long id){
        if(this.bookService.findById(id).isPresent()) {
            Book book = this.bookService.findById(id).get();
            model.addAttribute(book);
            return "books/new";
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }

    @GetMapping("/new")
    public String getForm(){
        return "books/new";
    }
    @PostMapping
    public String create( @ModelAttribute Book newBook){
        this.bookService.save(newBook);
        return "redirect:book";
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book newBook){
        if(this.bookService.findById(id).isPresent())
            return this.bookService.save(newBook);
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }
    @GetMapping("/delete")
    public String showDelete(){return "books/delete";}

    @PostMapping("/delete")
    public String deleteBook(@RequestParam Long id) {
        Optional<Book> bookToDelete = bookService.findById(id);
        if (bookToDelete.isPresent()) {
            bookService.delete(bookToDelete.get());
        } else {
            System.out.println("El libro con ID " + id + " no existe.");
        }
        return "redirect:/book";
    }

}
