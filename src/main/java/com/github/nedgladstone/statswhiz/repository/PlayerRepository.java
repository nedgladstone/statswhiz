package com.github.nedgladstone.statswhiz.repository;

import com.github.nedgladstone.statswhiz.model.Player;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    @Executable
    Player find(String nameLast, String nameFirst);
}
