package Demo17_抽象类;
/**
 * 继承dog，拥有父类的所有属性，可以重写，也可以新增属性。
 */
public class GoldenDog extends Dog {
    @Override
    public void eat(){
        System.out.println("金猫不吃骨头，吃米饭");
    }
    @Override
    public void sleep() {
        System.out.println("金毛晚上睡觉");
    }
}
