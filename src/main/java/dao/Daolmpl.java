package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class Daolmpl  implements  IDao{


    @Override
    public double getData() {
        System.out.println("version base de données");
        double temp = 25;
        return temp;
    }

}