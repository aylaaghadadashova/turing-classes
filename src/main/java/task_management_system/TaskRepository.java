package task_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository<T extends Task> {
    private List<T> tasks;

    public TaskRepository() {
        tasks = new ArrayList<>();
    }

    public void save(T task){
        tasks.add(task);
    }

    public void deleteById(Integer id) throws TaskNotFoundException{
        for(Task task : tasks){
            if(task.getId().equals(id)){
                tasks.remove(task);
                return;
            }
        }
        throw new TaskNotFoundException("Task with id " + id + " not found!");
    }

    public Optional<T> findById(Integer id){
        for(T task : tasks){
            if(task.getId().equals(id)){
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    List<T> findAll(){
        return tasks;
    }
}
