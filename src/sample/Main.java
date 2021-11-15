package sample;

import classes.Barges;
import classes.Demandes;
import classes.Services;
import classes.Terminal;


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
        Terminal A = new Terminal(true,null,null);
        Terminal B = new Terminal(true,null,null);
        Terminal C = new Terminal(true,null,null);
        Terminal D = new Terminal(true,null,null);

        //creation des barges
        Barges une = new Barges();
        Barges deux = new Barges();
        Barges trois = new Barges();
        Barges quatre = new Barges();
        //creation des demandes
        Demandes d= new Demandes();
        int temps=0;
        ArrayList<Demandes> listDemandes = new ArrayList<>();
        d.lectureDemandes(listDemandes);
        for (Demandes demande : listDemandes)
        {
            System.out.println("ID : " + d.getID()
                    + " Origine : " + d.getOrigine()
                    + " Destination : " + d.getDestination()
                    + " Date transport : " + d.getDateTransport()
                    + " Date finale : " + d.getDateFinal()
                    + " Volume : " + d.getNumber() );
        }
        // Création des services
        Services s = new Services();
        ArrayList<Services> listServices = new ArrayList<>();
        s.lectureServices(listServices);
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
        while (!listDemandes.isEmpty()){
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

        }

    }
}
