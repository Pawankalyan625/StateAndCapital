package org.studyeasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studyeasy.entity.States;

public interface StateRepository extends JpaRepository<States, Integer>{

	
}
