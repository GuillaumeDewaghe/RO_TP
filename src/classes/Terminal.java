package classes;
//pas utilisé pour scenario de base
import java.util.LinkedList;

public class Terminal
{
    private boolean isAvailable;
    private LinkedList<Barges> listBarges;
    private LinkedList<Containers> listContainers;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public LinkedList<Barges> getListBarges() {
        return listBarges;
    }

    public void setListBarges(LinkedList<Barges> listBarges) {
        this.listBarges = listBarges;
    }

    public LinkedList<Containers> getListContainers() {
        return listContainers;
    }

    public void setListContainers(LinkedList<Containers> listContainers) {
        this.listContainers = listContainers;
    }

    public Terminal(boolean isAvailable, LinkedList<Barges> listBarges, LinkedList<Containers> listContainers) {
        this.isAvailable = isAvailable;
        this.listBarges = listBarges;
        this.listContainers = listContainers;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "isAvailable=" + isAvailable +
                ", listBarges=" + listBarges +
                ", listContainers=" + listContainers +
                '}';
    }
}
