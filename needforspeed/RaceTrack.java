package needforspeed;

class NeedForSpeed {
    public int speed, batteryDrain, distancedriven = 0,  battery = 100;
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed; 
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery-batteryDrain<0;
    }
    

    public int distanceDriven() {
        return this.distancedriven;
    }

    public void drive() {
        if (!this.batteryDrained()){
            this.distancedriven += speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (car.batteryDrain*((this.distance/car.speed) + (this.distance%car.speed == 0?0:1)))<=100;
    }
}
