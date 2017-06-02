package Dao;

import Model.Team;

import java.util.List;

/**
 * Created by Admin on 02/06/2017.
 */
public interface TeamDAO {
    Team findByID(int id);

    List<Team> findAll();
}
