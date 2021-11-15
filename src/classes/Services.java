package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
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
    private String dechargement;
    private String chargement;

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

    public void setTempsArriveDestination(int tempsArriveDestination) {
        this.tempsArriveDestination = tempsArriveDestination;
    }

    public String getDechargement() {
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
    }

    public void lectureServices(ArrayList<Services> listServices)
    {
        /**
         * Permet la lecture d'un fichier
         */
        try
        {
            File myObj = new File("C:\\Users\\Guill\\Documents\\GitHub\\RO_TP\\src\\texts\\1_services.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                Services services = new Services();
                String data = myReader.nextLine();
                //System.out.println(data);
                String[] temp = data.split("\\s+");
                services.setID(Integer.parseInt(temp[0]));
                services.setOrigine(temp[1]);
                services.setDestination(temp[2]);
                services.setTempsChargementOrigine(Integer.parseInt(temp[3]));
                services.setTempsDechargementDestination(Integer.parseInt(temp[4]));
                services.setTempsDepartOrigine(Integer.parseInt(temp[5]));
                services.setTempsArriveDestination(Integer.parseInt(temp[6]) );
                services.setNumber(Integer.parseInt(temp[7]) );
                if(temp[8] != null)
                {
                    //Séparation
                    String[] temp2 = temp[8].split(",");
                    String dechargement = temp[0] + "," + temp[1] + "," + temp2[3] + "," +temp2[4];
                    String chargement = temp[0] + "," + temp[2] + "," + temp2[3] + "," +temp2[5];
                    services.setDechargement(dechargement);
                    services.setChargement(chargement);
                }
                listServices.add(services);
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
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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
                ", dechargement='" + dechargement + '\'' +
                ", chargement='" + chargement + '\'' +
                '}';
    }
}
