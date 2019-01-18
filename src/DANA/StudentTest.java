package DANA;

import java.util.concurrent.atomic.AtomicInteger;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("HANA");
        Student student2 = new Student("dua");
        Student student3 = new Student("tiga");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}


