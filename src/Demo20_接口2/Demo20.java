package Demo20_接口2;

public class Demo20 {
    public static void main(String[] args) {
        MyInterfaceDefaultA defaultA = new MyInterfaceDefaultA();
        defaultA.getMethod();
//        添加的默认方法如果该实现类中没有，那就往上找-接口
        defaultA.getMethod2();
        System.out.println("============");
        MyInterfaceDefaultB defaultB = new MyInterfaceDefaultB();
        defaultB.getMethod();
        defaultB.getMethod2();

//        错误写法：不能通过接口实现类的对象来调用接口当中的静态方法。
//        MyInterfaceDefaultC defaultC = new MyInterfaceDefaultC();
//        defaultC.getMethod();
//        正确写法
        MyInterfaceStatic.getMethod();

//        P179 接口的私有方法定义。
    }
}
