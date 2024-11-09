package hmsystem.models;

import java.time.LocalDate;
import java.util.HashMap;

public class AvailabilityList {

    private HashMap<LocalDate, Availability> availabilityMap;

    public AvailabilityList() {
        this.availabilityMap = new HashMap<>();
    }

    public Availability getAvailability(LocalDate date) {
        return availabilityMap.get(date);
    }

    public void setAvailability(LocalDate date, Availability availability) {
        availabilityMap.put(date, availability);
    }

    public HashMap<LocalDate, Availability> getAvailabilityMap() {
        return availabilityMap;
    }
}

{
    date: {
        time: status
    }
    date:{time:status}
}

{time:status}