public class Main {
    private static void loadData(Library library)
    {
        Author author1 = new Author("Gary Paulson", "1939-05-17");
        Author author2 = new Author("Stephen King", "1947-09-21");
        Author author3 = new Author("J.K. Rowling", "1965-07-31");
        Author author4 = new Author("George Orwell", "1903-06-25");
        Author author5 = new Author("Agatha Christie", "1890-09-12");
        Author author6 = new Author("F. Scott Fitzgerald", "1896-09-24");
        Author author7 = new Author("Mary Shelley", "1797-08-30");
        Author author8 = new Author("Leo Tolstoy", "1828-08-28");
        Author author9 = new Author("Jane Austen", "1775-12-16");
        Author author10 = new Author("Gabriel García Márquez", "1927-03-06");



        library.addBook(new Book("Hatchet", author1, "978-0307455925", "Simon & Schuster", 1));
        library.addBook(new Book("The Mist", author2, "978-0375704024", "Scribner", 1));
        library.addBook(new Book("Harry Potter and the Sorcerer's Stone", author3, "978-0590353427", "Scholastic", 1));
        library.addBook(new Book("1984", author4, "978-0451524935", "Signet Classic", 1));
        library.addBook(new Book("Murder on the Orient Express", author5, "978-0007119318", "HarperCollins", 1));
        library.addBook(new Book("The Great Gatsby", author6, "978-0743273565", "Scribner", 1));
        library.addBook(new Book("Frankenstein", author7, "978-0486282114", "Dover Publications", 1));
        library.addBook(new Book("War and Peace", author8, "978-1400079988", "Vintage", 1));
        library.addBook(new Book("Pride and Prejudice", author9, "978-0141439518", "Penguin Classics", 1));
        library.addBook(new Book("One Hundred Years of Solitude", author10, "978-0060883287,", "Harper Perennial", 1));

        

    }
    public static void main(String[] args) {
        Library library = new Library();

        loadData(library);
        System.out.println(library.searchBook("978-0743273565"));

        Patron patron1 = new Patron("Daniel Hayward", "123 Maple Street", "111-222-3333");

        patron1.borrow(library.searchBook("978-0451524935"));

        System.out.println(library.searchBook("978-0451524935").getStatus());

        Patron patron2 = new Patron("John Doe", "123 Street Street", "444-555-6666");
        
        patron2.borrow(library.searchBook("978-0451524935"));

        patron1.returnBook(library.searchBook("978-0451524935"));

        System.out.println(library.searchBook("978-0451524935").getStatus());
    }
}
