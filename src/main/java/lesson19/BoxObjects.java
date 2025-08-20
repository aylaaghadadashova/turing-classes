package lesson19;

public class BoxObjects<T, E, D, F> extends Box implements Material{
    D content;
    F weight;

    public BoxObjects(Object element, Object count, D content, F weight) {
        super(element, count);
        this.content = content;
        this.weight = weight;
    }

    public D getContent() {
        return content;
    }

    public void setContent(D content) {
        this.content = content;
    }

    public F getWeight() {
        return weight;
    }

    public void setWeight(F weight) {
        this.weight = weight;
    }

    @Override
    public D getDoubleContent(){
        return content;
    }

    @Override
    public String toString() {
        return "BoxObjects{" + "\n" +
                "element=" + element + "\n" +
                "count=" + count + "\n" +
                "weight=" + weight + "\n" +
                '}';
    }
}
