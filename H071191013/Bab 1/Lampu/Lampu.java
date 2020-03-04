class Lampu{
    boolean blueOn;
    boolean redOn;

    public void setBlueOn(boolean blueOn){
        this.blueOn = blueOn;
    }
    public void setRedOn(boolean redOn){
        this.redOn = redOn;
    }
    public void turnOff(){
        blueOn = false;
        redOn = false;
    }
    public void turnOn(){
        if(!blueOn && !redOn){
            blueOn = true;
            redOn = false;
        }else if(!blueOn && redOn){
            blueOn = true;
            redOn = false;
        }else if (blueOn && !redOn){
            blueOn = false;
            redOn = true;
        }   
    }
    public void getState(){
        System.out.println("Lampu biru = " + blueOn);
        System.out.println("Lampu merah = " + redOn);
    }
}