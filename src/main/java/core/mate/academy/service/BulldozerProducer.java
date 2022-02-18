package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        for (int i = 100; i < 105; i++) {
            bulldozerList.add(new Bulldozer(i));
        }
        return bulldozerList;
    }
}
