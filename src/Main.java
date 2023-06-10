import LibraryUsers.Employee;
import LibraryUsers.Store;
import LibraryUsers.Student;
import LibraryUsersInterfaces.Administrator;
import LibraryUsersInterfaces.Reader;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Петр");
        Student student1 = new Student("Мария");

        Employee employee = new Employee();

        Store store = new Store();

        employee.orderBook(store, "Atomic habits", 54);

        System.out.println(" ");
        student.takeBook(employee, "Hello world");
        student1.returnBook("Diary");

        System.out.println(" ");
        employee.findBook("Война и Мир");
        employee.givesBook(student1, "Мастер и Маргарита");
        employee.notifyAboutOverdue(student, "Искусство любить");

        System.out.println(" ");
        store.deliveryBook(50, "Золотая рыбка");
    }
}
