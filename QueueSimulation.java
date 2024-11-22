//question1

package sheet_5;


import java.util.Scanner;

interface QueueImpl {
    void insert(int element) throws Exception;
    int delete() throws Exception;
    void display();
}

class QueueDemo implements QueueImpl {
    private int[] queue;
    private int front, rear, size;
    private final int MAX_SIZE = 10;

    public QueueDemo() {
        queue = new int[MAX_SIZE];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void insert(int element) throws Exception {
        if (size == MAX_SIZE) {
            throw new Exception("Queue Overflow: Cannot insert, the queue is full.");
        }
        if (rear == MAX_SIZE - 1) {
            rear = -1;
        }
        rear++;
        queue[rear] = element;
        size++;
        if (front == -1) {
            front = 0;
        }
    }

    public int delete() throws Exception {
        if (size == 0) {
            throw new Exception("Queue Underflow: Cannot delete, the queue is empty.");
        }
        int deletedElement = queue[front];
        front++;
        if (front == MAX_SIZE) {
            front = 0;
        }
        size--;
        return deletedElement;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % MAX_SIZE] + " ");
        }
        System.out.println();
    }
}

public class QueueSimulation {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Queue Operations (Max size = 10):");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        while (!exit) {
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to insert: ");
                    int element = scanner.nextInt();
                    try {
                        queue.insert(element);
                        System.out.println("Inserted: " + element);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int deleted = queue.delete();
                        System.out.println("Deleted: " + deleted);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

