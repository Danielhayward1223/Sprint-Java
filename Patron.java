import java.util.*;

public class Patron {
    private String name;
    private String address;
    private String phoneNum;
    private List<Book> borrowedBooks;

    public Patron(String name, String address, String phoneNum)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.borrowedBooks = new ArrayList<>();
    }

    public Patron(Patron p)
    {
        this.name = p.name;
        this.address = p.address;
        this.phoneNum = p.phoneNum;
        this.borrowedBooks = p.borrowedBooks;
    }

    public void borrow(Book book)
    {
        if (book.getStatus() == Status.AVAILABLE){
            borrowedBooks.add(book);
            book.setStatus(Status.CHECKED_OUT);
        } else {
            System.out.println("This book is currently not available.");
        }
    }

    public void returnBook(Book book)
    {
        if (borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.setStatus(Status.AVAILABLE);
        } else {
            System.out.println("This patron has not borrowed this book.");
        }
    }

    public void set(String name, String address, String phoneNum)
    {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String toString()
    {
        return("Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNum() + "\nBorrowed Books: " + getBorrowedBooks());
    }
}
