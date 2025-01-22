package com.springdingdong.hany.week2;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class PlayerRepository {

    private final EntityManager em;

    public void save(Player player) {
        em.persist(player);
    }

    public Player findOne(Long id) {
        return em.find(Player.class, id);
    }

    public List<Player> findAll() {
        return em.createQuery("select p from Player p", Player.class).getResultList();
    }

    public List<Player> findByTeam(String team) {
        return em.createQuery("select p from Player p where p.team = :team", Player.class)
                .setParameter("team", team)
                .getResultList();
    }

    public void delete(Long id) {
        Player player = findOne(id);
        if (player != null) {
            em.remove(player);
        }
    }
}