public class Tamago {

    private int leben = 100;
    private int tamagoEnergie = 100;

    public  Tamago (){

    }


    //Get
    public int getLeben() {
        return this.leben;
    }

    //Set
    public void setLeben(int leben) {
        this.leben = leben;
    }

    //Schaden berechnen bei normalem Angriff
    public void receiveBasicAttack (){
        this.leben = leben - 5;
    }

    //Schaden berechnen bei SPEZIAL Angriff
    public void receiveSpecialAttack() {
        this.leben = leben -10;
    }

    //Schaden berechnen bei U L T R A Angriff
    public void receiveUltraAttack() {
        this.leben = leben - 30;
    }
}