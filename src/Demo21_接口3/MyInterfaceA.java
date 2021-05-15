package Demo21_接口3;

public interface MyInterfaceA {
    public default void defaultMethodA(){
        System.out.println("这是一个默认方法A");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }
    public default void defaultMethodB(){
        System.out.println("这是一个默认方法B");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }
//    公共方法，抽取两个默认方法之间相同的代码
}
