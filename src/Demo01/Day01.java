package Demo01;

import java.util.Arrays;

public class Day01 {
    public static void main(String[] args) {
        System.out.println("hello world!");
        String[] names = {"飞侠恒", "战恒", "安卓"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("============>");
        for (String name:names){
            System.out.println(name);
        }
        int []c= new int[10];
        System.out.println(c.length);
//        获取数组的最大最小值
        int[]numbers={12,13,14,65,45,78,20};
        int max=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("最大值"+max);
//        数组的反转
        int []num={1,2,3,4};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for (int min=0,maxx=num.length-1;min<maxx;min++,maxx--){
            int temp=num[min];
            num[min]= num[maxx];
            num[maxx]=temp;
        }
        System.out.println("二级反转");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
//        快捷打印    sout
        int []array={10,20,30,40};
        System.out.println("数组是="+Arrays.toString(array));
    }
//    局部变量必须得有默认值










}
