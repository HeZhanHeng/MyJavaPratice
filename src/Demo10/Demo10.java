package Demo10;

/**
 * Math类是数学相关的工具类，里面提供了大量静态的方法，完成与数学运算相关的操作
 * 常用方法：abs:绝对值  ceil:向上取整  floor：向下取整  round:四舍五入  PI:圆周率
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2));
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(3.6));
        System.out.println(Math.round(2.5));
//        题目：计算在-10.8到5.9之间的绝对值大于6或者小于2.1的整数有多少个
        int count = 0;//计算数量
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min; i < max; i++) {//强制转换为int
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("满足要求的有" + count + "个");
    }
}
