public class Box {

    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDensity() {
        return this.mass / (this.width * this.height * this.depth);
    }
}