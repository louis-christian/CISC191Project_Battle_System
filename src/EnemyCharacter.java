import java.util.Random;

public class EnemyCharacter extends Character {

	// fields

    private Random random = new Random(); // this is to help randomize the enemies' actions. 
    
    
    // constructors 
    public EnemyCharacter(String name, int hp) {
        super(name, hp);
    }

    
    @Override
    public void attack(Character target) 
    {
        System.out.println(name + " strikes " + target.getName() + "!");
        int damage = 8 + random.nextInt(5); 
        target.takeDamage(damage);
    }

    @Override
    public void defend() 
    {
       	System.out.println(name + " takes a defensive stance.");
    	status = "Defending";
    }

    @Override
    public void rest() {
        System.out.println(name + " pauses to recover.");
        hp += 3;
        if (hp > 100) hp = 100;
    }

    public void decideAction(Character player) {
        int choice = random.nextInt(3); // i hope i'm using this right lmao

        if (choice == 0) {
            attack(player);
        } else if (choice == 1) {
            defend();
        } else {
            rest();
        }
    
    
    }

    
    
}
