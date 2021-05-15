package Demo11;
/**
 *继承:主要解决的问题就是共性抽取
 * 特点：1.子类可拥有父类的内容
 *      2.子类还可以拥有自己专有的内容
 * 定义父类：就是一个普通的类定义
 * 直接通过子类对象访问成员变量：
 *     等号左边是谁，就优先用谁，没有则向上找
 * 间接通过成员方法访问成员变量：
 *     该方法属于谁，就优先使用谁，没有则向上找
 *
 */
public class Demo11 {
    public static void main(String[] args) {
//        创建子类对象
        Child child=new Child();
//        虽然子类啥都没写，但是会继承父类的方法
        child.methodFu();
//        创建另一个子类对象
        Child2 child2=new Child2();
        child2.methodFu();
//        创建父类对象
        Father father=new Father();
        System.out.println(father.numFu);//只能使用父类的对象，没有任何子类内容
        System.out.println(child.numFu+"||"+child.numZi);//可以访问父类及其子类
        System.out.println(child.num);//父类和子类成员变量重名
        System.out.println(father.num);
//        子类间接调用父类
        child.methodZi();
    }
}
