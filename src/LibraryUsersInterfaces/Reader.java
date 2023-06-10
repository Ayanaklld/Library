package LibraryUsersInterfaces;

public interface Reader {
    String getName();

    void takeBook(Administrator administrator, String bookName);

    void returnBook(String bookName);

}
