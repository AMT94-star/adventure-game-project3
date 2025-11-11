package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TreasureRoomTest {

    @Test
    void enterRoom() {
        TreasureRoom treasureRoom = new TreasureRoom();
        FakeUI fakeUi = new FakeUI();
        fakeUi.setInput("ja");
        Player player = new Player.Builder().name("Asli")
                .health(100).score(0).strength(10).build();
        player.setFoundKey(true);

        treasureRoom.enterRoom(player, fakeUi);
        assertTrue(player.hasOpenedChest());
        System.out.println(player.hasOpenedChest());
    }
}