package Dao.Impl;

import Dao.TeamDAO;
import Model.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Admin on 02/06/2017.
 */
public class TeamImpl implements TeamDAO {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Team findByID(int id)
    {
        String sql = "Select p from Team p where p.id = :id";

        Query query = entityManager.createQuery(sql).setParameter("id", id);

        return (Team) query.getSingleResult();
    }

    @Override
    public List<Team> findAll()
    {
        String sql = "Select p from Team p";

        Query query = entityManager.createQuery(sql);

        return query.getResultList();
    }

}
