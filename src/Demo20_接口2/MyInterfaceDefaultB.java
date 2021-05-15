package Demo20_接口2;

public class MyInterfaceDefaultB implements MyInterface {
    @Override
    public void getMethod() {
        System.out.println("接口实现一个方法");
    }
    @Override
    public void getMethod2(){
        System.out.println("重写接口的默认方法");
    }
}
