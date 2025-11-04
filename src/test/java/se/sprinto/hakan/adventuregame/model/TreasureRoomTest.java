package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreasureRoomTest {

    @Test
    void enterRoom() {
        TreasureRoom treasureRoom = new TreasureRoom();
        Player player = new Player.Builder().name("Asli")
                .health(100).score(0).strength(10).build();

        player.setOpenedChest(true);

        if(player.hasFoundKey()){
            System.out.println(player.hasOpenedChest());
        }
    }
}