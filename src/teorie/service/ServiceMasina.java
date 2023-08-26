package teorie.service;

import teorie.models.Masina;

import java.util.ArrayList;

public class ServiceMasina {

    private ArrayList<Masina> masini;


    public ServiceMasina() {

        this.masini= new ArrayList<>();
        Masina masina = new Masina("Golf 4","Volkswagen",100, "V4", true,3000 );

        Masina masina1 = new Masina("Solenza", "Dacia Renault", 75,"SOHC8", true,1000);

        Masina masina2 = new Masina("Focus","Ford",235,"S4",true,8000);

        Masina masina3 = new Masina("Charger","Doge",292,"V6",true,10000);

        Masina masina4 = new Masina("Impala","Chevrolet",303,"V6",true,9000);

        masini.add(masina);
        masini.add(masina1);
        masini.add(masina2);
        masini.add(masina3);
        masini.add(masina4);



    }

    public void afisareMasini() {
        for (int i =0; i < masini.size(); i++) {
            System.out.println(masini.get(i).descriere());
        }
    }

    //todo:functie ce returneaza masina cea m-a0 scumpa

    public Masina ceaMaiScumpaMasina() {
        int max =-1;
        Masina masinaMax =this.masini.get(0);
        for(int i = 0; i < masini.size();i++) {
            if (masini.get(i).getPret() > max) {
                max = masini.get(i).getPret();
                masinaMax = masini.get(i);
            }
        }
        return masinaMax;
    }

}
