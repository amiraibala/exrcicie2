package ex2cour;

public class AfficheComplet  implements Observateur {
    public void miseAJour(String position, int precision) {
        System.out.println("Position : " + position + " Pr�cision : " + precision + "/10");
    }


}
