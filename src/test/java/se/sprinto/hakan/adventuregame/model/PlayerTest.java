package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testIfAttackReducesEnemyHealth() {
        Player player = new Player.Builder().name("Asli")
                .health(100).score(0).strength(10).build();
        Enemy goblin = new Enemy("goblin", 50, 50, 10);

        player.attack(goblin);
        assertEquals(40,goblin.getHealth());
    }
}
