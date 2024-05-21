package Model.Dao.impl;

import db.DB;

public class DaoFactory {

	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
