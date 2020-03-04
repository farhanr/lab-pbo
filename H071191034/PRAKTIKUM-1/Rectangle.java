class Rectangle{
    double height;
    double width;

    public void setHeight(int height){
        this.height =  height;
    }

    public void setWidth (int width){
        this.width = width;
    }
    double getArea(){
        return this.height * this.width;
    }

    public void desc (){
        System.out.println("Luas = " + getArea());
    }

}