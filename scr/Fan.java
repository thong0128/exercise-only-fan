public class Fan {
    final static byte SLOW = 1;
    final static byte MEDIUM = 2;
    final static byte FAST  = 3;
    private byte speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(byte speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public byte getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    ", fan is on " + '\'' +
                    '}';
        }
        return "Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color +
                ", fan is off " + '\'' +
                '}';
    }
}
