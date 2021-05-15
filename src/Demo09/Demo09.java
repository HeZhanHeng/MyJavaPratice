package Demo09;

import java.util.Arrays;

/**
 * 静态代码块：当第一次调用到本类时，静态代码块执行唯一的一次。
 * 静态代码块优先于非静态
 * 静态代码块的典型用途：
 * 用来一次性的对静态成员变量进行赋值
 */
public class Demo09 {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
        String[] names = {"科比", "库里", "詹姆斯"};
        System.out.println(Arrays.toString(names));//数组转为字符串
        int[] num = {1, 3, 8, 2, 0};
        Arrays.sort(num);//默认排序：数字从小到大；字符串按照字母升序；自定义类型
        System.out.println(Arrays.toString(num));
        String[] world = {"安阳", "洛阳", "郑州", "河南"};
        Arrays.sort(world);//默认排序
        System.out.println(Arrays.toString(world));
//      字符串的倒序
        String string = "qerjkljgnklghiol123";
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
//        快捷方式chars.forr
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
