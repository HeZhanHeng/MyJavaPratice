package Demo24_多态2;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
    public void catchP(){
        System.out.println("狗会看门");
    }
}
