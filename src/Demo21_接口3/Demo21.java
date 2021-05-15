package Demo21_接口3;
/**
 * 使用接口需要注意的是：
 *  1.接口是没有静态代码块或者构造方法的
 *  2.一个类的直接父类是唯一的，但一个类可以实现多个接口
 *  3.如果实现类所实现的多个接口当中，存在同样的抽象方法，那么只需要覆盖重写一次即可。
 *  4.如果实现类中没有覆盖重写接口当中的所有抽象方法，那实现类一定是个抽象类
 *  5.如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
 *  6.一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类中的方法。
 */
public class Demo21 implements MyInterfaceB,MyInterfaceC {
    public static void main(String[] args) {
        System.out.println(MyInterfaceB.name);
    }

    @Override
    public void getMethod1() {
        System.out.println("覆盖重写B的抽象方法");
    }

    @Override
    public void sameMethod() {
        System.out.println("覆盖重写B和C共有的抽象方法");
    }

    @Override
    public void getMethod2() {
        System.out.println("覆盖重写接口C的抽象方法");
    }
}
