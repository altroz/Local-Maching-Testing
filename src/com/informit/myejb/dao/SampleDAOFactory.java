package com.informit.myejb.dao;
import javax.naming.NamingException;
import javax.naming.InitialContext;

public class SampleDAOFactory {
	private static SampleDAO dao = null;
	public static SampleDAO getDAO() throws SampleDAOException{
		//If we already have loaded the BookDAO, return it
		if (dao != null){
			return dao;
		}
		try{
			InitialContext ic = new InitialContext();
			String className = (String)ic.lookup("SAMPLEDAO.Impl");
			dao = (SampleDAO)Class.forName(className).newInstance();
		}
		catch (NamingException ne){
			throw new SampleDAOException(ne);
		}
		catch(Exception se){
			throw new SampleDAOException(se);
		}
		return dao;
	}
}
