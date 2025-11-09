package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ForestRoomTest {

    @Test
    void testEnterRoom() {
        ForestRoom forestRoom = new ForestRoom();
        Player player= new Player.Builder().name("Asli").strength(100).score(0)
                .strength(10).build();
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");
        forestRoom.enterRoom(player, fakeUI);

        if(fakeUI.getInput("ja").equals("ja")) {
            player.setFoundKey(true);
            System.out.println(player.getName() + " has found the key");
            System.out.println(player.hasFoundKey());
        }else{
            player.setFoundKey(false);
            System.out.println(player.hasFoundKey());
        }
        assertTrue(player.hasFoundKey());
    }
}