package Demo24_多态2;
/**
 * 对象的向上转型：父类引用指向之类对象【向上转型是安全的】
 *
 *
 * 对象的向下转型：其实是一个还原的动作。【注意事项】
 * 1、必须保证对象创建的时候就是猫，才能向下转型为猫
 * 2、如果对象创建的时候不是猫，现在非要向下转型就会报错。
 *
 * 如何才能知道一个父类引用的对象本来是什么子类？
 * 格式:
 *  对象 instanceof 类名称
 */
public class Demo24 {
    public static void main(String[] args) {
//        对象的向上转型  猫转为动物
        Animal animal = new Cat();
        animal.eat();
//        对象的向下转型
        Cat cat =(Cat)animal;
        cat.catchMouse();
//        类型转换报错,因为new的是cat
        try {
            Dog dog = (Dog)animal;
            dog.catchP();
        }catch (ClassCastException e){
            System.out.println("强制类型转换错误");
        }
        if (animal instanceof Dog){
            Dog dog =(Dog)animal;
            dog.catchP();
        }
        if (animal instanceof Cat){
            Cat cat1 = (Cat)animal;
            cat1.catchMouse();
        }

    }
}
