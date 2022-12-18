package prac6.task6_to_task9;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] array = {
                new Shop("KFC"),
                new Book("Lev Nikolaevich Tolstoy", "War and peace"),
                new Magazine("Forbes")
        };
        for (Printable elem : array) {
            elem.print();
        }
    }
}
