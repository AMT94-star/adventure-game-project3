package se.sprinto.hakan.adventuregame.dao;

import se.sprinto.hakan.adventuregame.model.Statistics;

import java.util.List;

public class FakeFileStatisticsDao implements StatisticsDao {
    @Override
    public void save(Statistics stat) {

    }
    @Override
    public List<Statistics> loadAll() {
        return List.of();
    }
}
