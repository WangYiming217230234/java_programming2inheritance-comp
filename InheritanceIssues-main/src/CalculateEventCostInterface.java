public interface CalculateEventCostInterface {
    public void calculateEventCost();
}

public class Event {
    // Existing code

    // Existing methods

    @Override
    public String toString() {
        // Existing code
    }
}

public class ConferenceEvent extends Event implements CalculateEventCostInterface {
    // Existing code

    @Override
    public void calculateEventCost() {
        // Implementation of calculateEventCost for ConferenceEvent
        // Add your logic here
    }
}

public class MusicEvent extends Event implements CalculateEventCostInterface {
    // Existing code

    @Override
    public void calculateEventCost() {
        // Implementation of calculateEventCost for MusicEvent
        // Add your logic here
    }
}

public class PastEvent extends Event {
    // Existing code

    // We don't implement the interface here because it is not required for PastEvent
}