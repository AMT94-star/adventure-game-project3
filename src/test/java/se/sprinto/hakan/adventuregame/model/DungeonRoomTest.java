package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.*;

class DungeonRoomTest {

    @Test
    void enterRoom() {
        DungeonRoom dungeonRoom = new DungeonRoom();
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("a");
        Player player = new Player.Builder().name("Asli").health(100)
                .score(0).strength(10).build();

    }
}