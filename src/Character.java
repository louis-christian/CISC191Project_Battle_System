/**
* Lead Author(s):
* @author louis; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2025-04-23
*/

/**
 * Purpose: The responsibility of Character is ...
 *
 * Character is-a ...
 * Character is ...
 */


public abstract class Character {
	
	//fields 
    protected String name;
    protected int hp;
    protected String status; 
    
    // right now the statuses we have are "normal" and "defeated".
    // we should expand this later especially if we have more enemies later. 
    
    //constructor
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.status = "Normal";
    }

    //basic actions
    public abstract void attack(Character target);
    public abstract void defend();
    public abstract void rest();

    //taking damage
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
        	
            hp = 0;
            status = "Defeated";
            
        }
        
    }
    

    public String getName() {
        return name;
    
    }

    public int getHp() {
        return hp;
    
    }

    public String getStatus() {
        return status;
    
    }

    // maybe if we add some other statuses, like paralysis and poison?? 
//    public void updateState() {


    @Override
    public String toString() {
        return name + " (HP: " + hp + ", Status: " + status + ")";
    }
}
