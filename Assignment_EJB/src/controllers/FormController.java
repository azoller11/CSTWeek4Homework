package controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Order;
import beans.User;
import business.AnotherOrdersBusinessService;
import business.MyTimerService;
import business.OrdersBusinessService;

@ManagedBean
public class FormController {
	
	@Inject 
	OrdersBusinessService obs;
	
	@EJB
	MyTimerService timer;
	
	
	public String onSubmit() {
		
		//Get the user value from the input form;
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		System.out.println("You clicked the submit button: " + user.getFirstName() +" " + user.getLastName());
		
		obs.test();
		
		// start a timer when the login is clicked
		timer.setTimer(10000);
		
		// Send the information to the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//To open  new page after the button is hit, return the file name of the desired page
		return "Response.xhtml";
	}
	
	
	public OrdersBusinessService getService() {
				obs.getOrder();
				return obs;
	}
	
	
	public String onFlash() {
		System.out.println("Flash!");
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		 FacesContext.getCurrentInstance().getExternalContext().getFlash().put("#{username}", "Hello World!");
		    return "TestResponse.xhtml?faces-redirect=true";
	}

}
