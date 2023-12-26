# Library Book Management - Documentation

This is a project for managing books in a library. The main objective is to provide a platform for creating, editing, listing, and deleting books. Below are the steps and key features of the project:

## Steps and Features

### 1. Model, Repository, and Service Classes

- **Book Model**: The `Book` class has been created with the following attributes: `id`, `name`, `editorial`, `author`, `price`, and `quantity`.

### 2. Controller

- **Book Controller**: A `BookController` class has been implemented to allow actions like creating, editing, and listing books. This class directs actions and then invokes the corresponding views.

### 3. Book Listing View

- **Book Listing**: A view has been designed to list the books. This view displays basic information about each book and provides links to view details, edit, and delete books.

### 4. Book Details View

- **Book Details**: A view has been designed to visualize the details of a specific book. This view obtains the book's ID from the route and displays detailed information about that book.

### 5. Book Creation Form

- **Creation Form**: A form for creating books has been developed. Users can input information such as name, editorial, author, price, and quantity to create a new book.

### 6. Book Deletion

- **Book Deletion**: Links have been added to allow book deletion. These links are linked to actions in the controller that delete the corresponding books.

### 7. Book Editing

- **Book Editing**: Links for editing books have been incorporated. These links direct to edit pages where users can modify information for existing books.

## Project Execution

- **Requirements**
To run the Bookstore Management System, you'll need the following:

- Java Development Kit (JDK) 17
- Apache Maven for building the project
- A web browser to access the application
  
- **Execution Instructions**: To start the application, run the server and open a web browser. Navigate to the corresponding routes to access the various functions of the project.

## Technologies Used
- **Spring Boot**: A Java-based framework for building web applications.
- **Thymeleaf**: A templating engine for server-side rendering of HTML templates.
- **Spring Data JPA**: Simplifies database access using Spring applications.
- **Lombok**: A Java library to reduce boilerplate code.
- **HTML/CSS**: For creating the user interface.
- **GitHub**: For version control and collaboration.

## Collaborators
- [Juan Pablo Acevedo](https://github.com/juanpabblo16)
- [Jesus Garces](https://github.com/JesusGarce22)
- [Santiago Arboleda](https://github.com/Santi1761)

## Getting Started
To run the application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/taller-1-intro-spring-equipo-9.git`

2. Build the project: `mvn clean install`

## [Report about activity](https://docs.google.com/document/d/1YvJYv9yR7bw0rL9Q2IR2XtSUMV3uLuMDgQbdWA1GLe0/edit?usp=sharing)

4. Run the application: `java -jar target/taller-1-intro-spring-equipo-9.jar`

5. Access the application in your web browser: `http://localhost:8080`

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


