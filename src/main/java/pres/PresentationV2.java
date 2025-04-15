package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args)  {
        try{
        Scanner scanner = new Scanner(new File("config.txt"));
        String doaClassname = scanner.nextLine();
       Class cDao=Class.forName(doaClassname);
       IDao dao=(IDao) cDao.getConstructor().newInstance();

       String metierClassname = scanner.nextLine();
        Class cMetier=Class.forName(metierClassname);
        Imetier metier=(Imetier) cMetier.getConstructor().newInstance();

           // metier.setDao(d);
            Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier,dao);

            System.out.println("Res="+metier.calcul());


        }catch( Exception e){
            System.out.println(e.getMessage());
        }
    }

}
