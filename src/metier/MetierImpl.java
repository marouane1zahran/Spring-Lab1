package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;
    //gggggggggggggggggg
//gggggggggggggggggg
//gggggggggggggggggg
//gggggggggggggggggg
//gggggggggggggggggg
    public void setDao(IDao dao) {
        this.dao = dao;
    }
//gggggggggggggggggg
//gggggggggggggggggg
//gggggggggggggggggg
//gggggggggggggggggg

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
}
