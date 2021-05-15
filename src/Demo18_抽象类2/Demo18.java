package Demo18_抽象类2;

import java.util.ArrayList;

/**
 * 发红包案例
 */
public class Demo18 {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member member1 = new Member("AAA",0);
        Member member2= new Member("BBB",0);
        Member member3= new Member("CCC",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("===========");
        ArrayList<Integer>redList=manager.send(20,3);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
