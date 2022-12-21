package com.loginLogout.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginLogout.model.CurrentUserSession;

public interface SessionDao extends JpaRepository<CurrentUserSession, Integer> {

	
	public  CurrentUserSession  findByUuid(String uuid);
}
