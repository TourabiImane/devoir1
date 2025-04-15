package pres;

import dao.Daolmpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        Daolmpl dao = new Daolmpl();
        MetierImpl m = new MetierImpl(dao);
        //m.setDao(dao);
        System.out.println("Res="+m.calcul());
    }
}