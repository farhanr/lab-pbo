class Box {
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width, double height, double depth) {
        density = width * height * depth;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public double getDepth() {
        return depth;
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
        return mass / density;
    }
    

}