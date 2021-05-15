package Demo08;

public class Student {
    private String name;
    private int age;
    static String room;//所在教室
    private int id;
    public static int countId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++countId;
    }

    public Student() {
        countId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
