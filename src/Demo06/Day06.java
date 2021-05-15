package Demo06;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个数组用来存储3个Person对象
 */
public class Day06 {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("飞侠恒", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("马尔扎哈", 20);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array);
        System.out.println(array[0].getName());
        System.out.println("=============>");
/**
 * ArrayList集合的使用：
 * 数组的长度不可以随意改变，但它可以
 * 常用的方法：add()添加,get()获取,remove()删除,size()长度
 *
 */
        List<Person> list = new ArrayList<>();
        list.add(new Person("飞侠恒", 26));
        list.add(new Person("张三", 27));
        list.add(new Person("李四", 28));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
        System.out.println("~~~~~~~");
        for (Person s : list) {
            System.out.println(s.getName());
        }
        /**
         * 字符串创建3+1
         * 1.new String
         * 2.字符数组创建
         * 3.字节数组创建
         * 4.直接加引号
         */
        String s1 = new String();
        System.out.println("第一个字符串" + s1);
        char[] chars = {'A', 'b', 'C'};
        String s2 = new String(chars);
        System.out.println("第二种字符数组创建字符串" + s2);
        byte[] bytes = {97, 98, 99};
        String s3 = new String(bytes);
        System.out.println("第三种字节数组创建字符串" + s3);
    }

}
