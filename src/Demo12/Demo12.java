package Demo12;

public class Demo12 {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
        /**
         * 在父子类的继承关系当中，创建子类对象，访问成员方法规则：
         *   创建的对象是谁，就优先用谁，如果没有则向上找。
         */
        zi.sameMethod();
    }
}
