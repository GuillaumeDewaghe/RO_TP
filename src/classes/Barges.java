package classes;

import java.util.LinkedList;

public class Barges
{
    private String groupe;
    private int number;
    private String type;
    private String carac;
    /**
     * EnAttente → au niveau d’un quai sur un terminal (arcs horizontaux du réseau espace temps dans les premiers scenarii)
     * - EnTransport → sur un arc non horizontal du réseau espace-temps
     * - [ChargementDechargement] → containers en chargement/déchargement → pour les scenarii ultérieurs
     * - [EnPanne] [EnReparation] → plus tard !
     * - [EnAttenteEcluse] → Non pris en compte
     * → Position : pour localiser « une barge » dans le réseau espace-temps (Identifiant du terminal où elle se trouve)
     */
    private String state;
    private LinkedList<Containers> listContainers;
    private int maxContainers;
    private int position;

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LinkedList<Containers> getListContainers() {
        return listContainers;
    }

    public void setListContainers(LinkedList<Containers> listContainers) {
        this.listContainers = listContainers;
    }

    public int getMaxContainers() {
        return maxContainers;
    }

    public void setMaxContainers(int maxContainers) {
        this.maxContainers = maxContainers;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Barges(String groupe, int number, String type, String carac, String state, LinkedList<Containers> listContainers, int maxContainers, int position) {
        this.groupe = groupe;
        this.number = number;
        this.type = type;
        this.carac = carac;
        this.state = state;
        this.listContainers = listContainers;
        this.maxContainers = maxContainers;
        this.position = position;
    }
    public Barges() {
        this.groupe = groupe;
        this.number = number;
        this.type = type;
        this.carac = carac;
        this.state = state;
        this.listContainers = listContainers;
        this.maxContainers = maxContainers;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Barges{" +
                "groupe='" + groupe + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", carac='" + carac + '\'' +
                ", state='" + state + '\'' +
                ", listContainers=" + listContainers +
                ", maxContainers=" + maxContainers +
                ", position=" + position +
                '}';
    }
}
