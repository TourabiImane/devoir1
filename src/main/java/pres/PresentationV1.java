package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.Imetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV1 {
    public static void main(String[] args) {
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        System.out.println("Res="+metier.calcul());
    }}