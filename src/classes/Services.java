package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Services
{
    private String groupe;
    private int number;
    private String type;
    private String carac;
    /**
     * Ouvert -> Le service est utilisable
     * Fermé -> Le service n'est pas utilisable
     */
    private boolean isUsable;
    private int nbBarges;
    private int ID;
    private String origine;
    private String destination;
    private int tempsChargementOrigine;
    private int tempsDechargementDestination;
    private int tempsDepartOrigine;
    private int tempsArriveDestination;
    private List<Arret> arretList;

    public Services() {
        this.arretList = new ArrayList<Arret>();
    }

    public void decreaseContainers()
    {

    }

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

    public boolean isUsable() {
        return isUsable;
    }

    public void setUsable(boolean usable) {
        isUsable = usable;
    }

    public int getNbBarges() {
        return nbBarges;
    }

    public void setNbBarges(int nbBarges) {
        this.nbBarges = nbBarges;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTempsChargementOrigine() {
        return tempsChargementOrigine;
    }

    public void setTempsChargementOrigine(int tempsChargementOrigine) {
        this.tempsChargementOrigine = tempsChargementOrigine;
    }

    public int getTempsDechargementDestination() {
        return tempsDechargementDestination;
    }

    public void setTempsDechargementDestination(int tempsDechargementDestination) {
        this.tempsDechargementDestination = tempsDechargementDestination;
    }

    public int getTempsDepartOrigine() {
        return tempsDepartOrigine;
    }

    public void setTempsDepartOrigine(int tempsDepartOrigine) {
        this.tempsDepartOrigine = tempsDepartOrigine;
    }

    public int getTempsArriveDestination() {
        return tempsArriveDestination;
    }

    /*public String getDechargement() {
        return dechargement;
    }

    public void setDechargement(String dechargement) {
        this.dechargement = dechargement;
    }

    public String getChargement() {
        return chargement;
    }

    public void setChargement(String chargement) {
        this.chargement = chargement;
    }*/

    public List<Arret> getArretList() {
        return arretList;
    }

    public void setArretList(List<Arret> arretList) {
        this.arretList = arretList;
    }

    public void setTempsArriveDestination(int tempsArriveDestination) {
        this.tempsArriveDestination = tempsArriveDestination;
    }

    @Override
    public String toString() {
        return "Services{" +
                "groupe='" + groupe + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", carac='" + carac + '\'' +
                ", isUsable=" + isUsable +
                ", nbBarges=" + nbBarges +
                ", ID=" + ID +
                ", origine='" + origine + '\'' +
                ", destination='" + destination + '\'' +
                ", tempsChargementOrigine=" + tempsChargementOrigine +
                ", tempsDechargementDestination=" + tempsDechargementDestination +
                ", tempsDepartOrigine=" + tempsDepartOrigine +
                ", tempsArriveDestination=" + tempsArriveDestination +
                '}';
    }
}
