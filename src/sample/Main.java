package sample;

import classes.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //creation des terminaux
        /*Terminal A = new Terminal(true,null,null);
        Terminal B = new Terminal(true,null,null);
        Terminal C = new Terminal(true,null,null);
        Terminal D = new Terminal(true,null,null);

        //creation des barges
        Barges une = new Barges();
        Barges deux = new Barges();
        Barges trois = new Barges();
        Barges quatre = new Barges();*/
        //creation des demandes
        int temps=0;
        ArrayList<Demandes> listDemandes = new ArrayList<>();
        lectureDemandes(listDemandes);
        for (Demandes d : listDemandes)
        {
            System.out.println("ID : " + d.getID()
                    + " Origine : " + d.getOrigine()
                    + " Destination : " + d.getDestination()
                    + " Date transport : " + d.getDateTransport()
                    + " Date finale : " + d.getDateFinal()
                    + " Volume : " + d.getNumber() );
        }
        // Création des services
        ArrayList<Services> listServices = new ArrayList<>();
        lectureServices(listServices);
        for (Services service : listServices)
        {
            System.out.println("ID : " + service.getID()
                    + " Origine : " + service.getOrigine()
                    + " Destination : " + service.getDestination()
                    + " Temps Chargement Origine : " + service.getTempsChargementOrigine()
                    + " Date Temps Dechargement Destination : " + service.getTempsDechargementDestination()
                    + " Date Temps Depart Origine : " + service.getTempsDepartOrigine()
                    + " Date Temps Arrive Destination : " + service.getTempsArriveDestination()
                    + " Volume : " + service.getNumber() );
        }

        //chaque i correspond a chaque demi journée
        /*while (!listDemandes.isEmpty()){
            //for each de la liste de service
                //if un service est disponible
                    //et que les temps corresponde avec la demande
                        // effectuer la demande puis la supprimer de la liste de demande


            //faire en sorte de regarder les demandes et faire agir les barges en fonction des services
            //si un service est disponible , realiser une demande
            //sinon attendre qu'un service soit possible
            temps++;
            if (temps>13){//gere les 14 demi journée
                temps=0;
            }

        }*/

    }

    public static void lectureServices(ArrayList<Services> listServices)
    {
        /**
         * Permet la lecture d'un fichier
         */
        try
        {
            File myObj = new File("src/texts/1_services.txt");
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
                    System.out.println("aaaaaaaaaaaa");
                    //Séparation
                    String[] temp2 = temp[8].split(";");
                    System.out.println("bbbbbbbbbbbb");
                    for (int i = 0; i<temp2.length; i++){
                        String[] temp3 = temp[i].split(",");
                        if (temp3.length != 0){
                            for (int j =0)
                            System.out.println(temp3);
                            services.getArretList().add(new Arret(temp3[0],Integer.parseInt(temp3[1]),Integer.parseInt(temp3[2])));
                            System.out.println("ccccccccccccc");
                        }
                    }
                    System.out.println("ddddddddddd");
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

    public static void lectureDemandes(ArrayList<Demandes> listDemandes)
    {
        /**
         * Permet la lecture d'un fichier
         */
        try
        {
            File myObj = new File("src/texts/1_demandes.txt");
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
