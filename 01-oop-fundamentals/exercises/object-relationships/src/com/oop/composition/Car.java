// Composition Example
public class Car {
    private final Engine engine;        // Engine cannot exist without Car
    private final TransmissionSystem transmission;
    
    public Car(String engineType, String transmissionType) {
        // Engine is created when Car is created
        this.engine = new Engine(engineType);
        this.transmission = new TransmissionSystem(transmissionType);
    }
    
    // When Car is destroyed, Engine is also destroyed
}

public class Engine {
    private String type;
    private boolean running;
    
    Engine(String type) {  // Package-private constructor
        this.type = type;
        this.running = false;
    }
    
    void start() {
        running = true;
    }
}

// Usage
Car car = new Car("V8", "Automatic");  // Engine created with Car
// Cannot create Engine independently
// Engine engine = new Engine("V8");  // Won't work if constructor is package-private