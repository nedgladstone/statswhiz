package com.github.nedgladstone.statswhiz.repository;

import com.github.nedgladstone.statswhiz.model.Player;
import com.github.nedgladstone.statswhiz.model.Stats;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface StatsRepository extends CrudRepository<Stats, Long> {
    @Executable
    List<Stats> find(long player, int season);

    @Executable
    List<Stats> find(int season);
}
