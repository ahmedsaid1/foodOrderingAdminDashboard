package com.eprogs.rest;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.eprogs.common.bean.AdminUserBean;
import com.eprogs.spring.bll.BllGateway;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	BllGateway bllGateway;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Role> roles=new ArrayList<>();
		
		AdminUserBean user=bllGateway.getAdminUser(username);
		if(user==null ) {
			System.out.println("Invalid user name");
			throw new UsernameNotFoundException("Invalid user name");
		}
		else {
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapToGrantedAuthority(roles));
		}
	}
	public List<GrantedAuthority> mapToGrantedAuthority(List<Role> roles){
		List<GrantedAuthority> authorities=new ArrayList<>();
		return authorities;
	}

}
