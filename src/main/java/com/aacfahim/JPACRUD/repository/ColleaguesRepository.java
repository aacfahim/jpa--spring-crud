package com.aacfahim.JPACRUD.repository;

import com.aacfahim.JPACRUD.model.Colleagues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColleaguesRepository extends CrudRepository<Colleagues, Integer> {

}
