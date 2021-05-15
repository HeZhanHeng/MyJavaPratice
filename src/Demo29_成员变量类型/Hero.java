package Demo29_成员变量类型;

public class Hero {
    private String nickName;
    private int age;
    private Weapon weapon;
    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }



    public void attack(){
        skill.use();
        System.out.println("年纪为"+age+"的"+nickName+"用"+weapon.getTool()+"和他自身拥有的"+"技能"+"超神了");
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
