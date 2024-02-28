import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Patron> patrons = new ArrayList<>();

    public void addBook(Book book)
    {
        books.add(book);

        
    }

    public void removeBook(String isbn)
    {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    public void addPatron(Patron patron)
    {
        patrons.add(patron);
    }

    public Book searchBook(String isbn)
    {
        for (Book book : books)
        {
            if (book.getIsbn().equals(isbn))
            {
                return book;
            }
        }
        return null;
    }
}
