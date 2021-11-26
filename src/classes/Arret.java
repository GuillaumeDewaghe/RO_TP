package classes;


import java.util.Objects;

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

    @Override
    public String toString() {
        return "Arret{" +
                "Position='" + Position + '\'' +
                ", dateA=" + dateA +
                ", dateD=" + dateD +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arret arret = (Arret) o;
        return dateA == arret.dateA && dateD == arret.dateD && Objects.equals(Position, arret.Position);
    }

}
