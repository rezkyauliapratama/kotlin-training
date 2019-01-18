package DANA;


import java.util.concurrent.atomic.AtomicInteger;

public class Student{
    static AtomicInteger nextId = new AtomicInteger();
    private int id;
    private String name;

    public Student(String name) {
        id = nextId.incrementAndGet();
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": "+name;
    }
}
