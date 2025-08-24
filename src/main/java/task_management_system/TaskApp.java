package task_management_system;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TaskApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskRepository<Task> repository = new TaskRepository<>();
        TaskService taskService = new TaskServiceImpl(repository);

        while (true) {
            System.out.println("\n=== Task Management System ===");
            System.out.println("1. Add Task");
            System.out.println("2. Add Deadline Task");
            System.out.println("3. Assign User for Task");
            System.out.println("4. Find Task by ID");
            System.out.println("5. Delete Task by ID");
            System.out.println("6. List All Tasks");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();

                    Task task = new Task(TaskIdGenerator.generateId(), title, desc, LocalDateTime.now(), false, TaskStatus.NEW);
                    taskService.addTask(task);
                    System.out.println("Task added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter deadline (YYYY-MM-DDTHH:MM): ");
                    String deadlineInput = scanner.nextLine();
                    LocalDateTime deadline = LocalDateTime.parse(deadlineInput);
                    DeadlineTask deadlineTask = new DeadlineTask(TaskIdGenerator.generateId(), title, desc, LocalDateTime.now(), false, TaskStatus.NEW, deadline);

                    if (deadline.isBefore(LocalDateTime.now())) {
                        System.out.println("Warning: Deadline has already passed!");
                    }

                    taskService.addTask(deadlineTask);
                    System.out.println("Deadline task added successfully!");
                }
                case 3 -> {
                    System.out.print("Enter task ID to assign user: ");
                    Integer taskId = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        Optional<Task> optionalTask = taskService.findTaskById(taskId);
                        if (optionalTask.isPresent()) {
                            Task task = optionalTask.get();
                            System.out.print("Enter user ID: ");
                            int userId = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Enter user name: ");
                            String userName = scanner.nextLine();

                            ImmutableUser user = new ImmutableUser(userId, userName);

                            task.assignUser(user);
                            System.out.println("User assigned to task successfully!");
                        } else throw new TaskNotFoundException("Task with id " + taskId + " not found!");

                    } catch (TaskNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.print("Enter task ID to find: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        Optional<Task> optionalTask = taskService.findTaskById(id);
                        if (optionalTask.isPresent()) {
                            System.out.println(optionalTask.get());
                        } else throw new TaskNotFoundException("Task with id " + id + "not found!");
                    } catch (TaskNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.print("Enter task ID to delete: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        taskService.removeTask(id);
                        System.out.println("Task deleted successfully!");
                    } catch (TaskNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    List<Task> allTasks = taskService.listAllTasks();
                    if (allTasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        for (Task task : allTasks) {
                            System.out.println(task);
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }
}