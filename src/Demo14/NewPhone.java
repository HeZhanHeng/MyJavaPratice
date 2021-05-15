package Demo14;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();//直接把父类show方法拿过来重复利用
//        System.out.println("显示来电号码");//这部分代码就可以省略了
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
