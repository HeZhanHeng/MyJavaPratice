package Demo07;

import java.util.Scanner;

/**
 * 字符串常量池：程序中直接写上的双引号字符串就在常量池中
 * 对于基本类型来说，==是进行数值的比较
 * 对于引用类型来说，==时进行地址值的比较
 * 常用方法：equals,concat,charAt,indexOf,subString
 *
 */
public class Day07 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        char[] array = {'a', 'b', 'c'};
        String s3 = new String(array);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s3));//内容进行比较返回true
        String s4="Abc";
        System.out.println("==========");
        System.out.println(s1.equalsIgnoreCase(s4));//忽略英文大小写
        String s5=s1.concat(s4);//字符串拼接
        System.out.println(s5);
        char charAt= "Hello".charAt(1);//指定索引
        System.out.println(charAt);
        int index="hellohello".indexOf("llo");//第一次的索引值
        System.out.println("第一次的索引值"+index);
        String sub=s1.substring(1);//左闭右开区间
        System.out.println(sub);
        String string="hello world";
        String sub2=string.substring(6,10);//光标+按住shift
        System.out.println(sub2);
        /**
         * string常用的转换方法
         * 1.toCharArray字符串数组
         * 2.getBytes字符串底层的字节数组
         * 3.replace替换
         * 4.split分割:其实是一个正则表达式，如果按照英文.去切割，必须写"\\."因为.有特殊的含义
         */
         char[]first="hello".toCharArray();
        System.out.println("转换"+first[0]);
        System.out.println("字符串数组的长度"+first.length);
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");
        String one="how old are you";
        String ones = one.replace("o", "*");
        System.out.println("替换方法"+ones);
        String two="我草你妈";
        String twos = two.replace("草", "*").replace("妈","*");
        System.out.println(twos);
        String three="hello world";
        String[] threes = three.split("o");
        for (int i = 0; i < threes.length; i++) {
            System.out.println("切割"+threes[i]);
        }
        String four="和 战恒";
        String[] fours = four.split(" ");
        System.out.println(fours[0]);
        System.out.println(fours[1]);
        String five="aaa.bbb.ccc";
        String[] fives = five.split("\\.");
        for (int i = 0; i < fives.length; i++) {
            System.out.println(fives[i]);
        }
        int[]arr={1,2,3};
        System.out.println(formatArrayToStr(arr));
        String result=formatArrayToStr(arr);
        String res = result.replace("#", "");
        System.out.println(res);
    }
//    方法名、返回值、参数列表
    public static String formatArrayToStr(int[]array){
       String str="[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str+="world"+array[i]+"]";
            }else {
                str+="world"+array[i]+"#";
            }
        }
        return str;
    }
}
