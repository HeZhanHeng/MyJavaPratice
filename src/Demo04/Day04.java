package Demo04;

import java.util.Random;
import java.util.Scanner;

/**
 * Scanner类的功能可以实现键盘输入数据到程序当中
 * <p>
 * 引用类型的一般使用步骤：
 * 1.导包:
 * 只有java.lang包下的内容不需要导包，其他的包都需要导入import语句
 * 2.创建
 * 类名称 对象名 =new 类名称()
 * 3.使用
 * 对象名.成员方法名()
 */

/**
 *匿名对象：就是只有右边的对象，没有左边的名字和赋值运算符.只能使用一次，下次用不得不再创建
 * 一个新的对象
 */

public class Day04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("获取键盘输入的int数字" + num);
        String name = scanner.next();
        System.out.println(name);
    }


}
