import java.util.Random;

public class Spieler {

    private int leben;
    private int leisteZweiWert;
    private int leisteZweiMax;
    private int klasse;
    private String LeisteZwei = "";
    private Random random = new Random();
    int randomAttackZahl;

    public Spieler (int klasse){

        if (klasse == 1){
            //Berserker
            setLeben(80);
            this.LeisteZwei = "Wut:      ";
            this.leisteZweiWert = 0;
            this.klasse = klasse;
            this.leisteZweiMax = 150;

        } else if (klasse == 2){
            //Ritter
            setLeben(100);
            this.LeisteZwei = "Ausdauer: ";
            this.leisteZweiWert = 100;
            this.klasse = klasse;
            this.leisteZweiMax = 100;
        } else if (klasse == 3){
            //Magier
            setLeben(70);
            this.LeisteZwei = "Mana:     ";
            this.leisteZweiWert = 200;
            this.klasse = klasse;
            this.leisteZweiMax = 200;

        }
    }

    //Get
    public int getKlasse() {
        return this.klasse;
    }

    public int getLeben() {

        return this.leben;
    }

    public int getLeisteZweiMax(){
        return this.leisteZweiMax;
    }


    public int getleisteZweiWert() {
        return this.leisteZweiWert;
    }


    public String getLeisteZwei() {
        return this.LeisteZwei;
    }

    //Set
    public void setLeben(int leben) {
        this.leben = leben;
        return;
    }

    public void setleisteZweiWert(int leisteZweiWert) {
        this.leisteZweiWert = leisteZweiWert;
        return;
    }

    public void setLeisteZwei(String LeisteZwei) {
        this.LeisteZwei = LeisteZwei;
        return;
    }

    //Zufällige angriffe von Tamago generieren
    public int genRandomAttack (){
        return this.randomAttackZahl = random.nextInt(3);
    }

    //Schaden berechnen bei normalem Angriff
    public void receiveBasicAttack (){
        this.leben = leben - 5;
        return;
    }

    //Schaden berechnen bei Spezial Angriff
    public void receiveSpecialAttack() {
        this.leben = leben -10;
    }

    //Schaden berechnen bei Spezial Angriff
    public void receiveUltraAttack() {
        this.leben = leben - 30;
    }

}