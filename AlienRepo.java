package com.telusko.springbootmvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.springbootmvc.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>{

	//List<Alien> findByAname(String aname);
	@Query("from Alien where aname=:name")
	List<Alien>find(@Param("name")String aname);

}