package Demo15;
/**
 * //      super关键字的三种用法。
 * //        1.在子类的成员方法中，访问父类的成员变量。
 * //        2.在子类的成员方法中，访问父类的成员方法。
 * //        3.在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {
    int num = 200;
    public Zi(){
//        super();//在调用父类无参构造方法
//        super(2);//调用父类有参构造方法
        System.out.println("子类无参构造");
        System.out.println(super.num);//父类中的成员变量
    }
    public void method(){
        super.methodFu();//访问父类的成员方法
    }
}
