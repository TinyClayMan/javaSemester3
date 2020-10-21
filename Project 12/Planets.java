public enum Planets {
    MERCURY ("Mercury", 2440, 3.33, 23),
    VENUS ("Venus", 6051, 4.87, 24),
    EARTH ("Earth", 6378, 5.97, 24),
    MARS ("Mars", 3389, 6.4, 23),
    JUPITER ("Jupiter", 69911, 1.9, 27),
    SATURN ("Saturn", 58232, 5.68, 26),
    URANUS ("Uranus", 25362, 8.68, 25),
    NEPTUNE ("Neptune", 24622, 1.02, 26);

    private String title;
    private double r;
    private double m;
    private double magnitude;

    Planets(String title, double r, double m, int magnitude){
        this.title = title;
        this.r = r;
        this.m = m;
        this.magnitude = magnitude;
    }

    public String getTitle() {
        return title;
    }

    public double getGravity() {
        double G = 6.674;
        double g = (G*m*Math.pow(10, magnitude-11-6))/(r*r); // 11 from G, 6 (3*3) from km in r
        return g;
    }
}
