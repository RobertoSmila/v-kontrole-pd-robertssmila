package Projekts.kods;

public class burti {
    public static void main(String[] args){
        String teikums = "Kad skolēni sabojā git projektu: \"Nu ko… laiks jaunam klonam.";

        int skaitsA = 0;
        for (int i = 0; i < teikums.length(); i++){
            if(teikums.charAt(i) == 'a'){
                skaitsA++;
            }
        }
        System.out.print("Teikumā burts a ir minēts " + skaitsA + " reizes.");
    }
}
