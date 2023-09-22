public class Tamago {

    private int leben = 80;
    private int lebenMax = 80;

    public  Tamago (){

    }


    //Get
    public int getLebenMax() {
        return lebenMax;
    }


    public int getLeben() {
        return this.leben;
    }

    //Set
    public void setLeben(int leben) {
        this.leben = leben;
    }

    //Schaden berechnen bei normalem Angriff
    public void receiveBasicAttack (){
        this.leben = leben - 10;
    }

    //Schaden berechnen bei SPEZIAL Angriff
    public void receiveSpecialAttack() {
        this.leben = leben -20;
    }

    //Schaden berechnen bei U L T R A Angriff
    public void receiveUltraAttack() {
        this.leben = leben - 40;
    }
}