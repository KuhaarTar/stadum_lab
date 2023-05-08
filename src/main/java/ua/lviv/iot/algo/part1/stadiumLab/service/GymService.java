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
    private final Map<Integer, Gym> gyms = new HashMap<>();

    public Gym getGymsById(final int id) {
        return gyms.get(id);
    }

    public List<Gym> getAllGyms() {
        return new LinkedList<>(gyms.values());
    }

    public Gym saveGym(final Gym obj) {
        obj.setId(nextAvailable++);
        gyms.put(obj.getId(), obj);
        return obj;
    }

    public Gym deleteGym(final Integer id) {
        Gym test = gyms.get(id);
        gyms.remove(id);
        return test;
    }

    public void updateGym(final Integer id, final Gym obj) {
        obj.setId(id);
        gyms.put(id, obj);
    }
}
