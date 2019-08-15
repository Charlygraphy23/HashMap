package Ingeritance;

public class Tub {

    private int size;
    private Bubbles bubbles;

    public Tub(int size) {
        this.size = size;
        bubbles=new Bubbles();
        bubbles.setColor("Blue");
        bubbles.setRadius(23);
    }

    public int getSize() {
        return size;
    }

    public int getBubblesize(){
        return bubbles.getRadius();
    }

    public String getBubbleColor(){
        return bubbles.getColor();
    }
}
