package LibraryUsers;

import LibraryUsersInterfaces.Administrator;
import LibraryUsersInterfaces.Reader;

public class Student implements Reader {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Administrator administrator, String bookName) {
        administrator.givesBook(this, bookName);
    }

    @Override
    public void returnBook(String bookName) {
        System.out.printf("Студент " + name + " вернул/ла книгу %s в библиотеку \n", bookName);
    }

    @Override
    public String getName() {
        return name;
    }


}
