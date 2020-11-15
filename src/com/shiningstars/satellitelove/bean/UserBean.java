package com.shiningstars.satellitelove.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import com.shiningstars.satellitelove.entity.User;

@Named
@RequestScoped
public class UserBean {
	private User user;
	
	@PostConstruct
	private void init() {
		user = new User();
	}
	
	public void create() {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getBirthday());
		System.out.println(user.getCreationDate());
		System.out.println(user.getSun());
		System.out.println(user.getAsc());
		System.out.println(user.getMoon());
		System.out.println(user.getVenus());
		System.out.println(user.getMars());
		System.out.println(user.getEmail());
	
	FacesMessage msg = new FacesMessage("User successfully created!");
	FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	//Browse homepage
	public String browseHome() {
		return "index?faces-redirect=true";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
