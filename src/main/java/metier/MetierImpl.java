package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl  implements Imetier {

    private IDao dao=null;
    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }

    /**
     * pour Injecter dans la variable un objet
     * d'une classe qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
