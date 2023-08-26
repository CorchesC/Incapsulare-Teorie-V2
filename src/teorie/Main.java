package teorie;


import teorie.models.Masina;
import teorie.service.ServiceMasina;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ServiceMasina serviceMasina= new ServiceMasina();


        serviceMasina.afisareMasini();

        System.out.println("-----------------------------------------------------------------------------------------");


        Masina masina = serviceMasina.ceaMaiScumpaMasina();


        System.out.println(masina.descriere());


    }
}