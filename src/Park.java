import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private String address;
    public Park(String parkName, String address) {
        this.parkName = parkName;
        this.address = address;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }
    }
}
