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

    public void lectureDemandes(ArrayList<Demandes> listDemandes)
    {
        /**
         * Permet la lecture d'un fichier
         */
        try
        {
            File myObj = new File("C:\\Users\\Guill\\Documents\\GitHub\\RO_TP\\src\\texts\\1_demandes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                Demandes demandes = new Demandes();
                String data = myReader.nextLine();
                //System.out.println(data);
                String[] temp = data.split(",");
                demandes.setID(Integer.parseInt(temp[0]));
                demandes.setOrigine(temp[1]);
                demandes.setDestination(temp[2]);
                demandes.setDateTransport(Integer.parseInt(temp[3]));
                demandes.setDateFinal(Integer.parseInt(temp[4]));
                demandes.setNumber(Integer.parseInt(temp[5]));
                /**
                 System.out.println("(test) ID : " + demandes.getID()
                 + " Origine : " + demandes.getOrigine()
                 + " Destination : " + demandes.getDestination()
                 + " Date transport : " + demandes.getDateTransport()
                 + " Date finale : " + demandes.getDateFinal()
                 + " Volume : " + demandes.getNumber() );
                 **/
                listDemandes.add(demandes);
                /**
                 for (Demandes d : listDemandes)
                 {

                 System.out.println("ID : " + listDemandes.get(i).getID()
                 + " Origine : " + listDemandes.get(i).getOrigine()
                 + " Destination : " + listDemandes.get(i).getDestination()
                 + " Date transport : " + listDemandes.get(i).getDateTransport()
                 + " Date finale : " + listDemandes.get(i).getDateFinal()
                 + " Volume : " + listDemandes.get(i).getNumber() );

                 System.out.println(d.getID() + d.getOrigine() + d.getDestination() + d.getDateTransport() + d.getDateFinal() + d.getNumber() );
                 }
                 */
            }
            myReader.close();
            for (Demandes d : listDemandes)
            {
                System.out.println("ID : " + d.getID()
                        + " Origine : " + d.getOrigine()
                        + " Destination : " + d.getDestination()
                        + " Date transport : " + d.getDateTransport()
                        + " Date finale : " + d.getDateFinal()
                        + " Volume : " + d.getNumber() );
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
