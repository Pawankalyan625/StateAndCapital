package org.studyeasy.services;

import java.util.List;

import org.studyeasy.entity.States;

public interface StateServices {

	

	public List<States> getAll();

	public States get(int id);
	public void addValues(States data);

	public void addUpdate(States data, int id);

	public void getDelete(int id);

	public int getNumberOfRecords();

	

}
