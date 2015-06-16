package com.informit.myejb.dao;

public interface SampleDAO {
	public SampleModel create(long int, String name, String data) throws SampleDAOException;
	public void delete (long id) throws SampleDAOException;
	public void update(long id, SampleModel model) throws SampleDAOException;
	public SampleModel[] findByName(String name) throws SampleDAOException;

	public SampleModel findByID(long id) throws SampleDAOException;
}
