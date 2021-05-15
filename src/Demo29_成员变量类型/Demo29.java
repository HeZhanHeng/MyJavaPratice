package Demo29_成员变量类型;

import java.util.ArrayList;
import java.util.List;

/**
 * 成员变量也可以是一个类。
 */
public class Demo29 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setNickName("武器大师");
        hero.setAge(20);
        Weapon weapon = new Weapon("三相之力");
        hero.setWeapon(weapon);
//        hero.setSkill(new SkillImpl());
//        使用匿名对象也可以
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biiubiubiu");
            }
        });
        hero.attack();
//        接口作为方法的参数
        List<String> list = new ArrayList<>();
        addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("王凯");
        list.add("佟丽娅");
        return list;
    }
}
