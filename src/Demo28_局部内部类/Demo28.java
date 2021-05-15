package Demo28_局部内部类;
/**
 * 如果一个类是定义在一个方法内部，那么这就是一个局部内部类。
 * 【注意事项】
 * 类的权限修饰符
 * public>protect>default>private
 * 定义一个类的时候，权限修饰符规则：
 * 1.外部类：public/(default)
 * 2.成员内部类：public、protect、default、private
 * 3.局部内部类：什么都不能写
 * 局部内部类：如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效的final】
 *匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称{
 *     //覆盖重写所有的抽象方法
 * }
 * 【匿名内部类的注意事项】
 * 1.匿名内部类在创建对象的时候，只能使用一次。如果希望多次创建对象，而且类的内容都一样，那就必须
 * 单独定义一个实现类。
 * 2.匿名对象，在【调用方法】的时候，只能调用唯一一次
 * 如果希望同一个对象，调用多次方法，那么必须给对象起个名字
 * 3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】。他俩不是一回事儿
 *
 */
public class Demo28 {
    public static void main(String[] args) {
       Outer outer = new Outer();
       outer.methodNum();//外面调用不了内部类，只能在里面调用了
//        207   匿名内部类
        /**
         *如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
         * 那么这种情况下就可以省略该类的定义，而改为使用【匿名内部类】
         *
         */
        MyInterfaceImpl im = new MyInterfaceImpl();
        im.method();
        MyInterface obj = new MyInterfaceImpl();
        obj.method();
//        这就是匿名内部类{}内就是
//        method不属于任何类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现的第二个方法");
            }
        };
        myInterface.method();
        myInterface.method2();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
//        省略对象名
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现的第二个方法");
            }
        }.method();
//        匿名对象无法调用第二次，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现的第二个方法");
            }
        }.method2();
    }
}
