package business;

import java.util.List;

import javax.ejb.Local;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import beans.Order;


@Local
public interface OrdersBusinessInterface  {
	
	public List<Order> getOrder();
	
	public void setOrder(List<Order> order);
	
	
	public void test();
	

}
