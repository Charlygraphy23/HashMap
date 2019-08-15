package Ingeritance;

public class Bathroom {

    private Tub tub;

    public Bathroom() {
        tub=new Tub(40);
    }

    public int getTubSize(){
        return tub.getSize();
    }

    public int getBubblesize(){
        return tub.getBubblesize();
    }

    public String getBubbleColor(){
        return tub.getBubbleColor();
    }

}
