package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Demandes
{
    private int ID;
    private String groupe;
    private int number;
    private String type;
    private String carac;
    private LinkedList<Containers> listContainers;
    /**
     * Attendue → La demande de transport est formulée mais les containers ne sont pas encore arrivés sur le quai de chargement
     * ArrivéeO → [Tous] les containers sont arrivés sur le quai de chargement du terminal d’origine
     * EnTransport → containers transitent sur un leg (arcs non horizontaux sur le réseau espace-temps)
     * EnAttente → container sur un quai ou en attente dans une barge (arcs horizontaux sur le réseau espace-temps)
     * [ChargementDechargement] → containers en chargement/déchargement → pour les scenarii ultérieurs
     * ArrivéeD → [Tous] les containers sont arrivés au terminal de destination (on suppose un déchargement immédiat, sauf s’il y a un arcs horizontal au niveau du réseau espace-temps)
     */
    private String state;
    private int dateTransport;
    private int dateAvailable;
    private int dateFinal;
    private int priority;
    private String origine;
    private String destination;

    private boolean isFragment(int ID)
    {
        return true;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public LinkedList<Containers> getListContainers() {
        return listContainers;
    }

    public void setListContainers(LinkedList<Containers> listContainers) {
        this.listContainers = listContainers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDateTransport() {
        return dateTransport;
    }

    public void setDateTransport(int dateTransport) {
        this.dateTransport = dateTransport;
    }

    public int getDateAvailable() {
        return dateAvailable;
    }

    public void setDateAvailable(int dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    public int getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(int dateFinal) {
        this.dateFinal = dateFinal;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

}
