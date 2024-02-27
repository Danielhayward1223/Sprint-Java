public class Book implements Borrowable {
    private String title;
    private Author author;
    private String isbn;
    private int numCopies;
    private String publisher;
    private Status status;


    public Book(String title, Author author, String isbn, String publisher, int numCopies)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numCopies = numCopies;
        this.status = Status.AVAILABLE;
    }

    public Book(Book b)
    {
        this.title = b.title;
        this.author = b.author;
        this.isbn = b.isbn;
        this.publisher = b.publisher;
    }

    public void borrowBook()
    {
        if (numCopies > 0 && status == Status.AVAILABLE){
            numCopies--;
            if (numCopies == 0){
                status = Status.CHECKED_OUT;
            }
        } else {
            System.out.println("This book is currently not available for lending.");
        }
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public Status getStatus()
    {
        return this.status;
    }

    public void returnBook()
    {
        numCopies++;
        status = Status.AVAILABLE;
    }

    public void addCopies(int numCopies)
    {
        numCopies++;
    }

    public void subtractCopies(int numCopies)
    {
        numCopies--;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return this.title;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }
    public Author getAuthor()
    {
        return author;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    @Override
    public String toString() {
        return ("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN: " + getIsbn() + "\nPublisher: " + getPublisher());
    }
}