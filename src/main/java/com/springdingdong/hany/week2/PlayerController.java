package com.springdingdong.hany.week2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerRepository playerRepository;

    @PostMapping
    public Long createPlayer(@RequestBody Player player) {
        playerRepository.save(player);
        return player.getId();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerRepository.findOne(id);
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("/team/{team}")
    public List<Player> getPlayersByTeam(@PathVariable String team) {
        return playerRepository.findByTeam(team);
    }

    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable Long id) {
        playerRepository.delete(id);
        return "Player deleted with id: " + id;
    }
}