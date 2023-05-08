package ua.lviv.iot.algo.part1.stadiumLab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.algo.part1.stadiumLab.service.GymService;
import ua.lviv.iot.algo.part1.stadiumLab.models.Gym;

import java.util.List;

@RestController
@RequestMapping("/gyms")
public class GymsController {
    private final GymService gymService;

    @Autowired
    public GymsController(final GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/:{id}")
    public ResponseEntity<Gym> getAlligatorById(@PathVariable("id") final Integer id) {
        Gym gym = gymService.getGymsById(id);
        if (gym == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(gym);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Gym>> getAllGyms() {
        List<Gym> gyms = gymService.getAllGyms();
        return ResponseEntity.ok(gyms);
    }

    @PostMapping("/")
    public ResponseEntity<Gym> saveGym(@RequestBody final Gym obj) {
        Gym savedGym = gymService.saveGym(obj);
        return ResponseEntity.ok(savedGym);
    }

    @DeleteMapping("/:{id}")
    public ResponseEntity<Gym> deleteGym(@PathVariable("id") final Integer id) {
        gymService.deleteGym(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/:{id}")
    public ResponseEntity<Gym> updateGym(@PathVariable("id") final Integer id, @RequestBody final Gym obj) {
        Gym gym = gymService.getGymsById(id);
        if (gym != null) {
            gymService.updateGym(id, obj);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
