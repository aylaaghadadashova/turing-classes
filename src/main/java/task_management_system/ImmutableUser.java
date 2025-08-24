package task_management_system;

import java.util.Objects;

public final class ImmutableUser {
    private final int id;
    private final String name;

    public ImmutableUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        ImmutableUser that = (ImmutableUser) object;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "ImmutableUser{" + '\n' +
                "id=" + id + '\n' +
                "name=" + name + '\n' +
                '}';
    }
}
