package com.aacfahim.JPACRUD.repository;

import com.aacfahim.JPACRUD.model.Colleagues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColleaguesRepository extends JpaRepository<Colleagues, Integer> {

}
