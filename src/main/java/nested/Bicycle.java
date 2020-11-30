package nested;

public class Bicycle {
    private int maxSpeed = 40;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        void damage() {
            maxSpeed *= 0.5;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static class Mechanic {
        void repair(Bicycle bicycle) {
            bicycle.maxSpeed += 15;
        }
    }
}
