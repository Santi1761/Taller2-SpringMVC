package icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private Long id;
    private String name;
    private String author;
    private String publisher;
    private double price;
    private Long cant;

    // Constructors, getters, and setters

    public Book(Book book) {this(book.getId(), book.getName(), book.getAuthor(),
            book.getPublisher(),book.getPrice(),book.getCant());}

}
