import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n ---Task Manager--- ");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("Enter Choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String dec = scanner.nextLine();
                    taskList.add(new Task(title, dec));
                    System.out.println("Task Add");
                    break;

                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("No Task Availabe");
                    } else {
                        System.out.println("All Tasks: ");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + "." + taskList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Number To Delete: ");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= taskList.size()) {
                        taskList.remove(index - 1);
                        System.out.println("task deleted");
                    } else {
                        System.out.println("Invalid Task Number: ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
    }while (choice !=4);
    }
}