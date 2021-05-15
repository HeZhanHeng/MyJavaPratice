package Demo20_接口2;
/**
 * 1.接口的默认方法，可以通过实现类对象，直接调用
 * 2.接口的默认方法，也可以被接口的实现类去覆盖重写
 */
public interface MyInterface {
    void getMethod();
    default void getMethod2(){
        System.out.println("新添加一个默认方法");
    };//想添加一个方法，又想让实现类不报错
}
