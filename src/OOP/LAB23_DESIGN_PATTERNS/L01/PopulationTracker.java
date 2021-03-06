package OOP.LAB23_DESIGN_PATTERNS.L01;

import java.util.HashMap;
import java.util.Map;

public class PopulationTracker {
    private Map<String, Long> counts;
    private static PopulationTracker instance;

    private PopulationTracker() {
        this.counts = new HashMap<>();
    }

    public static PopulationTracker getInstance() {
        if (instance == null) {
            instance = new PopulationTracker();
        }
        return instance;
    }

    public void add(String location, long count) {
        this.counts.putIfAbsent(location, 0L);
        this.counts.put(location, this.counts.get(location) + count);

    }

    public void remove(String location, long remove) {
        if (this.counts.containsKey(location)) {
            this.counts.put(location, this.counts.get(location) - remove);
        }
    }
}
