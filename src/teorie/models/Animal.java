package teorie.models;

public class Animal {

    //ATRIBUTE

     private String nume;
    private String specie;
    private int varsta;
    private String culoare;
    private String culoareOchi;



//    public  Animal(){
//
//        System.out.println("Eu sunt un constrcutor fara paramertii");
//    }
//

    public Animal(int varsta){

        System.out.println("Sunt constrcutorul cu un parametru");
    }


    //proprietati sau accesorii


    public void setNume(String nume){
        if(nume.equals("Andrei")){
            System.out.println("nuuuuuuuuuuuuuuuuuuuuuuuu");
        }else{
            this.nume=nume;

        }
    }

    public void setSpecie(String specie) {
        this.specie=specie;
    }

    public void setVarsta(int varsta) {
        this.varsta= varsta;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }



    public String getNume(){
        return this.nume;
    }

    public String getSpecie() {
        return this.specie;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public String getCuloareOchi() {
        return this.culoareOchi;
    }

    //METODE

    public void descriere(){

         String text="";
         text+="Nume: "+this.nume+"\n";
         text+="Specie: "+this.specie+"\n";
         text+="Varsta: "+this.varsta+"\n";
         text+="Culoare: "+this.culoare+"\n";
         text+="Culoare ochi: "+this.culoareOchi+"\n";

         System.out.println(text);

    }


}
