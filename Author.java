import java.util.*;

// Making the author class
public class Author {
    private String name;
    private String birth;
    private List<Book> booksWritten;

    public Author(String name, String birth)
    {
        this.name = name;
        this.birth = birth;
        this.booksWritten = new ArrayList<>();
    }

    public Author(Author a)
    {
        this.name = a.name;
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

    public void set(String name, String birth)
    {
        this.name = name;
        this.birth = birth;
    }

    public String getName()
    {
        return name;
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

