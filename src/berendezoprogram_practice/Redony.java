
package berendezoprogram_practice;


public class Redony {
    
   private final int szel;
   private int mag;
   private int aktMag;
   private boolean zart;
   
   public Redony (int szel, int mag){
   
   this.szel = szel;
   this.mag = mag;
   
   aktMag = 0;
   zart = true;
   
   }
    
   public void leenged(int aktMag){
        if(aktMag > mag){aktMag = mag;}
        this.aktMag = aktMag;
   }
   
   public void felhuz(){
       aktMag = 0;
    }

    public void setZart(boolean zart) {
        this.zart = zart;
    }
    //GETTEREK****************** 
    public int getSzel() {
        return szel;
    }
    public int getMag() {
        return mag;
    }
    public int getAktMag() {
        return aktMag;
    }
    public boolean isZart() {
        return zart;
    }
    //**************************

    //TOSTRING METHOD*************
    @Override
    public String toString() {
        return "Redony{" + "szel=" + szel + ", mag=" + mag + ", aktMag=" + aktMag + ", zart=" + zart + '}';
    }
   
     public void rajzol(){
        
        vonal();
        for (int i = 0; i < aktMag; i++) {
            char koztesJel = zart ? ' ' : '-'; 
            vonal('|', koztesJel);
        }
        vonal();
    }

    private void vonal() { 
        vonal('*','*'); 
    }

    private void vonal(char szelsoJel, char koztesJel) {
        System.out.print(szelsoJel);
        for (int i = 0; i < szel; i++) {
            System.out.print(koztesJel);
        }
        System.out.println(szelsoJel);
    }
   
   
}
