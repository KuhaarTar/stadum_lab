package ua.lviv.iot.algo.part1.stadiumLab.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.stadiumLab.models.Gym;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
@Scope("singleton")
public class GymService {
    private Integer nextAvailable = 1;
    private final Map<Integer, Gym> gymMap = new HashMap<>();

    public Gym getGymsById(final int id) {
        return gymMap.get(id);
    }

    public List<Gym> getAllGyms() {
        return new LinkedList<>(gymMap.values());
    }

    public Gym saveGym(final Gym obj) {
        obj.setId(nextAvailable++);
        gymMap.put(obj.getId(), obj);
        return obj;
    }

    public void deleteGym(final Integer id) {
        gymMap.remove(id);
    }

    public void updateGym(final Integer id, final Gym obj) {
        obj.setId(id);
        gymMap.put(id, obj);
    }
}
