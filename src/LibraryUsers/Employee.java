package LibraryUsers;

import LibraryUsersInterfaces.Administrator;
import LibraryUsersInterfaces.Librarian;
import LibraryUsersInterfaces.Reader;
import LibraryUsersInterfaces.Supplier;

public class Employee implements Librarian, Administrator {
    @Override
    public void findBook(String bookName) {
        System.out.println("Работник нашел книгу " + bookName);
    }

    @Override
    public void givesBook(Reader reader, String bookName) {
        System.out.printf(
                "Администратор выдал книгу %s читателю %s\n",
                bookName, reader.getName()
        );
    }


    @Override
    public void notifyAboutOverdue(Reader reader, String bookName) {
        System.out.printf("Администратор уведомил читателя %s о просрочке книги %s \n", reader.getName(), bookName);
        reader.returnBook(bookName);
    }

    @Override
    public void orderBook(Supplier supplier, String bookName, int numberOfBooks) {
        System.out.printf(
                "Библиотекарь заказал %s книг %s у поставщика\n",numberOfBooks, bookName
        );
        supplier.deliveryBook(numberOfBooks, bookName);
    }
}
