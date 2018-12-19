package com.example.Conteller;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.RoleMapper;
import com.example.entity.Role;



@RestController
public class RoleConteller {
	@Autowired
	RoleMapper mapper;
	
	//zheshiyigezhushi 
	@RequestMapping("/hello")
	public String role(Role role) {
		role.setRoleId(12);
		role.setRoleName("qwqwww");
		role.setDeptId(1);
		role.setRolePerson("reee");
		role.setRoleRemark("assss");
		role.setRoleTime(new Date());
		int list=mapper.insertSelective(role);
		System.out.println("-----"+list);
	   return "qw";
	}

}
