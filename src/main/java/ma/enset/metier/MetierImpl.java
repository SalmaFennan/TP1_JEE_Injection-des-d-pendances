package ma.enset.metier;
import DAO.IDao;

public class MetierImpl implements Metier{
    Private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
    double t = dao.getData();
    double res=t*23;
    return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
