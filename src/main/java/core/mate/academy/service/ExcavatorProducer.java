package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorList = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        for (int i = 1000; i < 1005; i++) {
            excavatorList.add(new Excavator(i));
        }
        return excavatorList;
    }
}
