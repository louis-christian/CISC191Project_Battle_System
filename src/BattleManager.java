
import java.util.Scanner;

public class BattleManager {
	
	//fields 
    private PlayerCharacter player;
    private EnemyCharacter enemy;
    private Scanner scanner;

    //constructor 
    public BattleManager(PlayerCharacter player, EnemyCharacter enemy) {
        this.player = player;
        this.enemy = enemy;
        this.scanner = new Scanner(System.in);
    }

    public void startBattle() {
        System.out.println("Start battle");

        player.goFirst();
        enemy.goFirst();
        
        if (player.getInitiative() > enemy.getInitiative()) {
        	System.out.println(player.getName() + " goes first!");
        } else { 
        	System.out.println(enemy.getName() + " goes first!");
        }
        
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            displayStatus();
            playerTurn();

            if (enemy.getHp() > 0) {
                enemy.decideAction(player);
            }

        }

        displayOutcome();
        scanner.close();
    }

    private void displayStatus() {
    	if (player.getInitiative() >= enemy.getInitiative()) {
    		System.out.println("Player: " + player);
    		System.out.println("Enemy: " + enemy);
    	} else {
    		System.out.println("Enemy: " + enemy);
    		System.out.println("Player: " + player);
    	}
    	
        // System.out.println("Player: " + player);
        // System.out.println("Enemy: " + enemy);
    }

    private void playerTurn() {
        System.out.println("Choose action: 1 = Attack, 2 = Defend, 3 = Rest"); // will be replaced by buttons
        String input = scanner.nextLine();

        
        //will be replaced by buttons
        //right now we chose actions on the terminal/console
        if (input.equals("1")) {
            player.attack(enemy);
        } else if (input.equals("2")) {
            player.defend();
        } else if (input.equals("3")) {
            player.rest();
        } else {
            System.out.println("Invalid input.");
        }
    }

    private void displayOutcome() {
        System.out.println("Battle over.");
        if (player.getHp() <= 0 && enemy.getHp() <= 0) {
            System.out.println("It's a tie.");
        } else if (player.getHp() <= 0) {
            System.out.println("You lost.");
        } else {
            System.out.println("You won.");
        }
    }
}
