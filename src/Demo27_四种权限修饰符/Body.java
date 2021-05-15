package Demo27_四种权限修饰符;

/**
 * 如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
 * 例如：身体————心脏       汽车————发动机
 * <p>
 * 分类：
 * 1.成员内部类
 * 2.局部内部类（包含匿名内部类）
 * 【注意】内访外随意，外用内必须要内部类对象
 */
public class Body {
    private String name = "飞侠恒";
    int num=10;
    //    成员方法
    public void method() {
        System.out.println("外部类成员方法");
       Heart heart = new Heart();
        heart.beat();
    }

    //    这就是成员内部类
    public class Heart {
        int num=20;
        public void beat() {
            int num=30;
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫" + name);
            System.out.println(num);//内部类的局部变量
            System.out.println(this.num);//内部类的成员变量
//            System.out.println(super.num);//并不是继承关系
            System.out.println(Body.this.num);//外部类的成员变量
        }
    }

}
