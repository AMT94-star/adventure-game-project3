package model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.model.ForestRoom;
import se.sprinto.hakan.adventuregame.model.Player;
import se.sprinto.hakan.adventuregame.view.FakeUI;

public class ForestRoomTest {
    @Test
    public void testEnterRoom(){
        ForestRoom forestRoom = new ForestRoom();
        Player player = new Player("Asli",100,0,500);

        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("nej");

        forestRoom.enterRoom(player,fakeUI);
    }
}
