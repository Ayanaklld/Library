package LibraryUsers;

import LibraryUsersInterfaces.Supplier;

public class Store implements Supplier {

    @Override
    public void deliveryBook(int numberOfBooks, String bookName) {
        System.out.printf("Книжный магазин доставил %s книг %s", numberOfBooks, bookName);
    }
}
