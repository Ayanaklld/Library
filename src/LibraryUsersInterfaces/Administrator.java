package LibraryUsersInterfaces;

public interface Administrator {
    void findBook(String bookName);

    void givesBook(Reader reader, String bookName);

    void notifyAboutOverdue(Reader reader, String bookName);
}
