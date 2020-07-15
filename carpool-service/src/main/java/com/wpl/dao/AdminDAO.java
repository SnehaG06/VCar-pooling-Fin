package com.wpl.dao;

import org.springframework.stereotype.Component;

import com.wpl.model.Admin;

@Component
public interface AdminDAO {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}