import java.util.Random;

public class Spieler {

    private int leben;
    private int lebenMax;
    private int leisteZweiWert;
    private int leisteZweiMax;
    private int leisteZweiRegen;
    private int klasse;
    private String LeisteZwei = "";
    private Random random = new Random();
    int randomAttackZahl;
    int basicCost;
    int specialCost;
    int ultraCost;

    public Spieler (int klasse){

        if (klasse == 1){
            //Berserker
            setLeben(80);
            this.lebenMax = 80;
            this.LeisteZwei = "Wut:      ";
            this.leisteZweiWert = 0;
            this.klasse = klasse;
            this.leisteZweiMax = 150;
            this.basicCost = 0;
            this.specialCost = 50;
            this.ultraCost = 100;
            this.leisteZweiRegen = 0;

        } else if (klasse == 2){
            //Ritter
            setLeben(100);
            this.lebenMax = 100;
            this.LeisteZwei = "Ausdauer: ";
            this.leisteZweiWert = 100;
            this.klasse = klasse;
            this.leisteZweiMax = 100;
            this.basicCost = 0;
            this.specialCost = 50;
            this.ultraCost = 80;
            this.leisteZweiRegen = 20;

        } else if (klasse == 3){
            //Magier
            setLeben(70);
            this.lebenMax = 70;
            this.LeisteZwei = "Mana:     ";
            this.leisteZweiWert = 200;
            this.klasse = klasse;
            this.leisteZweiMax = 200;
            this.basicCost = 0;
            this.specialCost = 70;
            this.ultraCost = 150;
            this.leisteZweiRegen = 30;

        }
    }

    //Get
    public int getLebenMax() {
        return lebenMax;
    }

    public int getLeisteZweiRegen() {
        return leisteZweiRegen;
    }

    public int getBasicCost() {
        return basicCost;
    }

    public int getSpecialCost() {
        return specialCost;
    }

    public int getUltraCost() {
        return ultraCost;
    }

    public int getKlasse() {
        return this.klasse;
    }

    public int getLeben() {

        return this.leben;
    }

    public void generateRage(int damageTaken) {
        this.leisteZweiWert += damageTaken;  // Für jeden Schaden 1 Wut.
        if (this.leisteZweiWert > this.leisteZweiMax) {
            this.leisteZweiWert = this.leisteZweiMax;
        }
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
    }

    public void setleisteZweiWert(int leisteZweiWert) {
        this.leisteZweiWert = leisteZweiWert;
    }

    public void setLeisteZwei(String LeisteZwei) {
        this.LeisteZwei = LeisteZwei;
    }

    //Zufällige angriffe von Tamago generieren
    public int genRandomAttack (){
        return this.randomAttackZahl = random.nextInt(3);
    }

    //Schaden berechnen bei normalem Angriff
    public void receiveBasicAttack (){
        this.leben = leben - 10;
    }

    //Schaden berechnen bei Spezial Angriff
    public void receiveSpecialAttack() {
        this.leben = leben -20;
    }

    //Schaden berechnen bei Spezial Angriff
    public void receiveUltraAttack() {
        this.leben = leben - 35;
    }

}