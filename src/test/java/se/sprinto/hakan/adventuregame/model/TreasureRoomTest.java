package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;

class TreasureRoomTest {

    @Test
    void enterRoom() {
        TreasureRoom treasureRoom = new TreasureRoom();
        Player player = new Player.Builder().name("Asli")
                .health(100).score(0).strength(10).build();
        player.setFoundKey(true);

        if(player.hasFoundKey()){
            player.setOpenedChest(true);
            System.out.println(player.hasOpenedChest());
        }else{
            System.out.println("Player has not found the key");
        }
    }
}