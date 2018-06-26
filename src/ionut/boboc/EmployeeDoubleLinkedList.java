package ionut.boboc;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeDoubleLinkedList() {

    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public boolean isEmpty() {
        if (size==0 && head == null && tail == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        EmployeeNode current = head;
        while (current != null) {
            sb.append(current.getEmployee().toString());
            sb.append("\n");
            current = head.getNext();
        }
        return sb.toString();
    }
}
