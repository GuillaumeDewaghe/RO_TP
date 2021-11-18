package classes;

import java.util.ArrayList;

public class Bag {
    ArrayList<Event> b;
    int date;

    public Bag(int date) {
        this.date = date;
        this.b=new ArrayList<Event>();
    }

    public ArrayList<Event> getB() {
        return b;
    }

    public void setB(ArrayList<Event> b) {
        this.b = b;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
