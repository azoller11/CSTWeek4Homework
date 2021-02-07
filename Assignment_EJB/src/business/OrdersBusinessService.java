package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
import beans.Orders;

/**
 * Session Bean implementation class OrderBusinessService
 */
@Stateless
@LocalBean
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {
	public List<Order> orders = new ArrayList<Order>();
	public OrdersBusinessService() {
		orders.add(new Order("100" , "This is product: 1", (float) (Math.random() * 100.0),1));
		setOrder(orders);
	}

	
	
	@Override
	public void test() {
		System.out.println("Hello from the OrdersBusinessService" );
		
	}
	
	Orders ord = new Orders();

	@Override
	public List<Order> getOrder() {
		return ord.getOrder();
	}

	@Override
	public void setOrder(List<Order> order) {
		ord.setOrder(order);
		
	}

}
