package Demo18_抽象类2;

import java.util.ArrayList;
import java.util.Random;

//成员
public class Member extends User {
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer>list){
//        从多个红包中取出一个
        int index=new Random().nextInt(list.size());
//        从集合当中删除一个,并且得到被删除红包给自己
        int  data = list.remove(index);
//        当前成员有多少钱
        int money=super.getMoney();
//        加法，并且重新设置进去
        super.setMoney(money+data);


    }
}
