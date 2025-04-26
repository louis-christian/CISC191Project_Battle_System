


public class TestBattle {

	
	public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("Player", 100);
        EnemyCharacter enemy = new EnemyCharacter("Enemy", 100);
        
        BattleManager manager = new BattleManager(player, enemy);
        manager.startBattle();
        
        
    }
}

