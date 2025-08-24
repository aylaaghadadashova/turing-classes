package task_management_system;

import java.time.LocalDateTime;
import java.util.Objects;

public class DeadlineTask extends Task{
    private LocalDateTime deadline;

    public DeadlineTask(Integer id, String title, String description, LocalDateTime createdAt, boolean isCompleted, TaskStatus status, LocalDateTime deadline) {
        super(id, title, description, createdAt, isCompleted, status);
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        DeadlineTask that = (DeadlineTask) object;
        return Objects.equals(deadline, that.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deadline);
    }

    @Override
    public String toString() {
        return "DeadlineTask{" + '\n' +
                "id=" + this.getId() + '\n' +
                "title=" + this.getTitle() + '\n' +
                "description='" + this.getDescription() + '\n' +
                "createdAt=" + this.getCreatedAt() + '\n' +
                "isCompleted=" + this.isCompleted() + '\n' +
                "status=" + this.getStatus() + '\n' +
                "deadline=" + deadline +  '\n' +
                '}';
    }
}
