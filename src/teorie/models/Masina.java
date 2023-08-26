package teorie.models;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.stream.StreamSupport;

public class Masina {

    private String model;
    private String brand;
    private int caiPutere;
    private String tipMotor;
    private Boolean rulata;
    private int pret;

    public Masina() {
    }

    public Masina(String model, String brand, int caiPutere, String tipMotor, Boolean rulata, int pret) {
        this.model = model;
        this.brand = brand;
        this.caiPutere = caiPutere;
        this.tipMotor = tipMotor;
        this.rulata = rulata;
        this.pret = pret;
    }

    public Masina(String model,String brand, int caiPutere,String tipMotor) {
        System.out.println("Nu este specifcat dace este rulata!");
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public void setRulata(Boolean aff) {
        this.rulata = aff;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }



    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCaiPutere() {
        return this.caiPutere;
    }

    public String getTipMotor() {
        return this.tipMotor;
    }

    public Boolean getRulata() {
        return this.rulata;
    }

    public int getPret() {
        return this.pret;
    }



    public String descriere() {
        String text ="";
        text+= "Model: " +this.model +"\n";
        text+= "Brand: " + this.brand +"\n";
        text+= "Cai putere: " +this.caiPutere +"\n";
        text+= "Tip motor: " +this.tipMotor + "\n";
        text+= "Rulata: " +this.rulata + "\n";
        text+= "Pret: " +this.pret+ "\n";
        return text;
    }

}
