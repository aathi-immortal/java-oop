package school;

public class Student {
    String name;
    int age;
    Student ob;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student() {
        this("aathi", 16);

    }

    public static void main(String[] args) {
        Student ob = new Student("ssiva", 23);
        final Student ob2 = new Student();
        ob2.name = "efre";
        ob2 = new Student();
        

    }
}
