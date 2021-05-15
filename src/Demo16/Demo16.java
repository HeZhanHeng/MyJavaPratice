package Demo16;

import javax.swing.plaf.PanelUI;

/**
 * this关键字的三种方法：
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在本类的成员方法中，访问本类的另一个成员方法。
 * 3.在本类的构造方法中，访问本类的另一个构造方法。
 * 【ps】:this调用也必须是构造方法的第一个语句，唯一一个
 *       super和this两种构造调用，不能同时使用
 *
 * 继承的三大特点：
 *  1，java语言是单继承的。一个类的直接父类只能有唯一一个
 *  2.java语言可以是多级继承。我有一个父亲，我父亲还有一个父亲也就是爷爷。（祖宗类：java.lang.object）
 *
 *
 */
public class Demo16 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.showNum();
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        methodA();
//        this.methodA();
        System.out.println("BBB");
    }
}
