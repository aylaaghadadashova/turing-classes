package task_management_system;

import java.time.LocalDateTime;

public class EmailTaskProcessor extends AbstractTaskProcessor {
    @Override
    void processTask(Task task) {
        if (task instanceof DeadlineTask) {
            DeadlineTask deadlineTask = (DeadlineTask) task;
            if (deadlineTask.getDeadline().isBefore(LocalDateTime.now())) {
                System.out.println("Deadline passed for task: " + deadlineTask.getTitle());
                return;
            }
        }
        System.out.println("Email sent for task " + task.getTitle());
    }
}
