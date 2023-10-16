package org.studyeasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.entity.States;
import org.studyeasy.services.StateServices;

@RestController
public class StateController {

	
	@Autowired
	private StateServices service;
	
	@RequestMapping(value = "/posts")
	public List<States> getAll(){
		return service.getAll();
	}
	@RequestMapping(value = "/posts/{id}")
	public States get(@PathVariable int id) {
		return service.get(id);
	}
	@RequestMapping(method = RequestMethod.POST,value = "/posts")
	public ResponseEntity<String> addValues(@RequestBody States data) {
		service.addValues(data);
		return new ResponseEntity<String>("Successfully one record added",HttpStatus.CREATED);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/posts/{id}")
	public ResponseEntity<String> addUpdate(@RequestBody States data,@PathVariable int id) {
		service.addUpdate(data,id);
		return new ResponseEntity<String>("Data updated successfully",HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/posts/{id}")
	public ResponseEntity<String> getDelete(@PathVariable int id) {
		service.getDelete(id);
		return new ResponseEntity<String>("Selected record deleted successfully",HttpStatus.OK);
	}
	@RequestMapping(value = "/count")
	public int getNumberOfRecords() {
		return service.getNumberOfRecords();
	}
	
	
	
	
	
}
