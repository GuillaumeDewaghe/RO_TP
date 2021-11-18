package classes;

public class Arret {
    String Position;
    int dateA;
    int dateD;

    public Arret(String position, int dateA, int dateD) {
        Position = position;
        this.dateA = dateA;
        this.dateD = dateD;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getDateA() {
        return dateA;
    }

    public void setDateA(int dateA) {
        this.dateA = dateA;
    }

    public int getDateD() {
        return dateD;
    }

    public void setDateD(int dateD) {
        this.dateD = dateD;
    }
}
