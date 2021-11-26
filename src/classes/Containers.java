package classes;

import java.util.LinkedList;
//pas utilisé pour scenario de base
public class Containers
{
    private String groupe;
    private int number;
    private String type;
    private String carac;
    /**
     * [Plein ou vide ? % remplissage ?] + voir les aspects repositionnement (i.e. remettre à disposition des containers vides) → trop complexe pour le projet en M2 TNSID
     * - EnAttente → attente de chargement/déchargement au niveau d’un quai sur un terminal (arcs horizontaux du réseau espace temps dans les premiers scenarii)
     * - EnTransport → sur un arc non horizontal du réseau espace-temps
     * - [ChargementDechargement] → containers en chargement/déchargement → pour les scenarii ultérieurs
     * - [EnPanne] [EnReparation] → plus tard !
     * - [EnAttenteEcluse] → Non pris en compte
     * → Position : pour localiser « une barge » dans le réseau espace-temps (Identifiant du terminal où elle se trouve)
     */
    private String state;
    private int nbContainers;

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

    public int getNbContainers() {
        return nbContainers;
    }

    public void setNbContainers(int nbContainers) {
        this.nbContainers = nbContainers;
    }

    public Containers(String groupe, int number, String type, String carac, String state, int nbContainers) {
        this.groupe = groupe;
        this.number = number;
        this.type = type;
        this.carac = carac;
        this.state = state;
        this.nbContainers = nbContainers;
    }

    @Override
    public String toString() {
        return "Containers{" +
                "groupe='" + groupe + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", carac='" + carac + '\'' +
                ", state='" + state + '\'' +
                ", nbContainers=" + nbContainers +
                '}';
    }
}
