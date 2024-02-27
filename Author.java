import java.util.*;

// Making the author class
public class Author {
    private String firstName;
    private String lastName;
    private String birth;
    private List<Book> booksWritten;

    public Author(String firstName, String lastName, String birth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.booksWritten = new ArrayList<>();
    }

    public Author(Author a)
    {
        this.firstName = a.firstName;
        this.lastName = a.lastName;
        this.birth = a.birth;
        this.booksWritten = a.booksWritten;

    }

    public void addBook(Book book)
    {
        booksWritten.add(book);
    }

    public void removeBook(Book book)
    {
        booksWritten.remove(book);
    }

    public void set(String firstName, String lastName, String birth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getName()
    {
        return(this.firstName + " " + this.lastName);
    }

    public String getBirth()
    {
        return(this.birth);
    }

    public List<Book> getBooks()
    {
        return(booksWritten);
    }

    public String toString()
    {
        return("Name: " + getName() + "\nBirth Date: " + getBirth() + "\nBooks Written: " + getBooks());
    }
}

