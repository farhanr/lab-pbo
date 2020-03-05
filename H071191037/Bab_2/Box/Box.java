class Box {
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width,double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void setWidth(double width){
        this.width = width;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    /**
     * @param mass the mass to set
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return the density
     */
    public double getDensity() {
        density = mass / (width*height*depth);
        return density;
    }
}