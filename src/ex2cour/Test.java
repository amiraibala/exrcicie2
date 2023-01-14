package ex2cour;

public class Test {
    public static void main(String[] args) {
        GPS g = new GPS();
        AfficheResume ar = new AfficheResume();
        AfficheComplet ac = new AfficheComplet();
        g.ajouterObservateur(ar);
        g.setMesures("N 39°59°993 / W 123°00°000", 4);
        g.ajouterObservateur(ac);
        g.setMesures("N 37°48°898 / W 124°12°011", 5);
    }

}
