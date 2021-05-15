package Demo08;

/**
 * static修饰方法
 */
public class MyClass {
    int num;//成员变量
    static int numStatic;//静态变量

    //    成员方法
    public void method() {
//        可以访问成员变量
        System.out.println(num);
//        可以访问静态变量
        System.out.println(numStatic);
        System.out.println("这是一个成员方法");
    }

    //    静态方法
    public static void methodStatic() {
//        System.out.println(num);
//        只能访问静态变量
        System.out.println(numStatic);
        System.out.println("这是一个静态方法");
    }
}
