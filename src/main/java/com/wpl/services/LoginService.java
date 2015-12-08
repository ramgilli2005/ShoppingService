package com.wpl.services;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wpl.model.UserDetails;
import com.wpl.tablemap.LoginDetails;

@Controller
@RequestMapping("/login")
@Transactional
public class LoginService {
	
	@Autowired
	private SessionFactory sf;
	
	@RequestMapping(value="/checklogin", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserDetails checkLogin(@RequestBody UserDetails userDetails){
		//Test for commit12
//		System.out.println(userDetails.getUserName());
//		userDetails.setFirstName("It Works");
		LoginDetails ld = (LoginDetails) sf.getCurrentSession().get(LoginDetails.class, userDetails.getUserName());
		userDetails.setStatus(ld.getStatus());
		userDetails.setFirstName(ld.getFirstName());
		return userDetails;
	}
}
