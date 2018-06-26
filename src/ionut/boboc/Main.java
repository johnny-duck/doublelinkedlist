package ionut.boboc;

public class Main {

    public static void main(String[] args) {

        Employee janeFonda = new Employee("Jane", "Fonda", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWillson = new Employee("Mike", "Willson", 3245);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        
        list.addToFront(janeFonda);
        System.out.println(list);
        list.addToFront(johnDoe);
        System.out.println(list);
        list.addToFront(marySmith);
        System.out.println(list);

    }
}
