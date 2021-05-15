package Demo18_抽象类2;

import java.util.ArrayList;
//群主
public class Manager extends User {
    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
//        首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();
//        首先看下群主有多少钱
        int leftMoney=super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return list;
        }
//        扣钱，重新设置余额
        super.setMoney(leftMoney-totalMoney);
//        发红包需要平均拆分成为多少份
        int avg=totalMoney/count;
        int mod=totalMoney%count;//零头
//        零头放在最后一个红包当中
//        下面把红包一个个放到集合中
        for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }
//        最后一个红包
        int last=avg+mod;
        list.add(last);
        return list;
    }
}
