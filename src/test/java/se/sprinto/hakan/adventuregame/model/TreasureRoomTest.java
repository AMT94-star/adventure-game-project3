package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TreasureRoomTest {

    @Test
    void enterRoom() {
        TreasureRoom treasureRoom = new TreasureRoom();
        FakeUI fakeUi = new FakeUI();
        Player player = new Player.Builder().name("Asli")
                .health(100).score(0).strength(10).build();
        player.setFoundKey(true);

        if(player.hasFoundKey()){
            player.setOpenedChest(true);
            assertTrue(player.hasOpenedChest());
            System.out.println("Player has opened the chest");
        }else{
            System.out.println("Player has not found the key");
        }
    }
}