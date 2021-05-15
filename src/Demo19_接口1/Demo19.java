package Demo19_接口1;

public class Demo19 {
    public static void main(String[] args) {
//        接口不能直接new，只能通过实现类来调用
        Demo19Object demo19Object=new Demo19Object();
        demo19Object.methodA();
        demo19Object.methodB();
    }
}
