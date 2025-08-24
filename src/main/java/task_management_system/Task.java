package task_management_system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Task {
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private boolean isCompleted;
    private TaskStatus status;

    private List<ImmutableUser> assignedUsers = new ArrayList<>();

    public Task(Integer id, String title, String description, LocalDateTime createdAt, boolean isCompleted, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.isCompleted = isCompleted;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public List<ImmutableUser> getAssignedUsers() {
        return assignedUsers;
    }

    public void assignUser(ImmutableUser user){
        assignedUsers.add(user);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Task task = (Task) object;
        return isCompleted == task.isCompleted && Objects.equals(id, task.id) && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(createdAt, task.createdAt) && status == task.status && Objects.equals(assignedUsers, task.assignedUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, createdAt, isCompleted, status, assignedUsers);
    }

    @Override
    public String toString() {
        return "Task{" + '\n' +
                "id=" + id + '\n' +
                "title=" + title + '\n' +
                "description='" + description + '\n' +
                "createdAt=" + createdAt + '\n' +
                "isCompleted=" + isCompleted + '\n' +
                "status=" + status + '\n' +
                '}';
    }
}

