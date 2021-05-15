package Demo05;

import java.util.Random;
/**
 * Random的使用
 */
public class Day05 {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(10);//左闭右开区间
        System.out.println("打印可以取到的数字"+number);
    }
}
