package Pb13.clase;

public class Bancomat {
    private double bani;
    Stare stare;

    public Bancomat(double bani) {
        this.bani = bani;
        this.stare=new nuAreCard();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void intorduCard(){
        if(this.stare instanceof nuAreCard){
            System.out.println("S-a introdus un card");
            Stare areCard=new areCard();
            areCard.schimbaStare(this);
        }
    }

    public void introduPin(){
        if(this.stare instanceof areCard){
            System.out.println("S-a introdus un PIN");
            Stare arePinIntrodus=new arePinIntrodus();
            arePinIntrodus.schimbaStare(this);
        }else{
            System.out.println("Mai intai trebuie introdus un card");
        }
    }
    public void retrageBani(double suma){

        if (this.stare instanceof arePinIntrodus) {
            if (suma > bani) {
                System.out.println("Sold insuficient!");
                Stare nuAreBani = new nuAreBani();
                nuAreBani.schimbaStare(this);
            }else{
                System.out.println("Retragerea banilor a fost efectuata!");
                this.bani-=suma;
            }
        }else{
            System.out.println("Trebuie introdus un PIN");
        }

    }
}
