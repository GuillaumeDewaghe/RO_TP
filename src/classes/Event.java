package classes;

public class Event {
    int id;
    String type;
    String position;
    Demandes demande;

    public Event(int id, String type, String position, Demandes demande) {
        this.id = id;
        this.type = type;
        this.position = position;
        this.demande = demande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Demandes getDemande() {
        return demande;
    }

    public void setDemande(Demandes demande) {
        this.demande = demande;
    }
}
