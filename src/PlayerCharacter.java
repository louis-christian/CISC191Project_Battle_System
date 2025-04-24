


public class PlayerCharacter extends Character {

	//constructor
    public PlayerCharacter(String name, int hp) {
        super(name, hp);
    }

    // attacking, like with a sword or depending on the hero? maybe we add mages or archers later. 
    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() + "!");
        int damage = 10; 
        target.takeDamage(damage);
    }

    @Override
    public void defend() {
        System.out.println(name + " defends!");
        status = "Defending";
    }

    @Override
    public void rest() {
        System.out.println(name + " rests and regains some HP!");
        hp += 5;
        if (hp > 100) hp = 100; 
    }
}
