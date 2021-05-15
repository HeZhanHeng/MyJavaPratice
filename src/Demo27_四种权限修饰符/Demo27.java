package Demo27_四种权限修饰符;

/**
 * public > protect > (default) >private、
 * 同一个类     YES     YES        YES        YES        我自己
 * 同一个包     YES     YES         YES       NO          我邻居
 * 不同包子类   YES     YES          NO        NO          我儿子
 * 不同包非子类  YES     NO          NO        NO           陌生人
 * 【注意事项】
 * default并不是关键字，而是根本不写
 * <p>
 * 如何使用内部类？有两种方式
 * 1.间接方式：在外部类当中，使用内部类，然后main只是调用外部类的方法。
 * 2.直接方式：公式
 */
public class Demo27 {
    public static void main(String[] args) {
        Body body = new Body();
        body.method();
        System.out.println("=====另外一种方式========");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
