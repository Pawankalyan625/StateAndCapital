package org.studyeasy.servicesImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.States;
import org.studyeasy.repository.StateRepository;
import org.studyeasy.services.StateServices;

@Service
public class StateServiceImplementation implements StateServices{

	@Autowired
	private StateRepository repo;

	public List<States> getAll() {
		List<States> list = new ArrayList<States>();
		for (States s : repo.findAll()) {
			list.add(s);
		}
		return list;
	}

	public States get(int id) {
		for (States s : repo.findAll()) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public void addValues(States data) {

		repo.save(data);

	}

	public void addUpdate(States data, int id) {

		for (States s : repo.findAll()) {
			if (s.getId() == id) {

				repo.save(data);
				return;
			}
		}

	}

	public void getDelete(int id) {
		for (States s : repo.findAll()) {
			if (s.getId() == id) {
				repo.deleteById(id);
			}
		}

	}

	public int getNumberOfRecords() {

		return (int) repo.count();
	}

}
