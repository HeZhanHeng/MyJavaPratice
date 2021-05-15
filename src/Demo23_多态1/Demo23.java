package Demo23_多态1;
/**
 *代码中体现的多态性————父类引用指向子类对象
 * 格式  ： 父类名称 对象名 = new 子类名称（）
 *     或者
 *     接口名称 对象名 = new 实现类（）
 * 访问成员变量的两种方式：
 * 1，直接通过对象名称访问成员变量，看等号左边是谁，就优先用谁，没有则向上找
 * 2.间接通过成员方法访问：看该方法属于谁，优先用谁，没有则向上找。
 *                      【小窍门】
 * 成员变量口诀：编译看左边，运行还看左边。
 * 成员方法口诀：编译看左边，运行看右边。
 *
 * 多态的好处：不需要关注右边是工人还是班主任，我只关心他们是干什么的。
 *   Teacher t = new Teacher();
 *   t.work()
 *   Assistant a = new Assistant()
 *   a.work()
 *   =============使用多态===================
 *   Employee e = new Teacher()
 *   e.work();
 *   Employee e = new Assistant()
 *   s.work();
 */
public class Demo23 {
    public static void main(String[] args) {
//        父类的引用，指向了右侧子类的对象
       Fu fu = new Zi();
       fu.method();//new 谁就走谁的方法
       fu.methodFu();
        System.out.println(fu.num);//
//      子类如果没有覆盖重写，那就是父=10，如果覆盖重写了那就是子=20
        fu.showNum();
    }
}
