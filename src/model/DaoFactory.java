package model;

import db.DB;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConection());
    }

    public static DepartmentDao createDeparmentDao(){return new DepartmentDaoJDBC(DB.getConection());}
}
