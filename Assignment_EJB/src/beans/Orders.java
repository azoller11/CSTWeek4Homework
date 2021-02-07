package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped 
public class Orders {
	
	public static List<Order> orders = new ArrayList<Order>();
	
	
	
	public Orders() {
		orders.add(new Order("100" , "This is product: 1", (float) (Math.random() * 100.0),1));
	}

	
	
	public List<Order> getOrder() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("100" , "This is product: 1", (float) (Math.random() * 100.0),1));
		setOrder(orders);
		return orders;
	}

	public void setOrder(List<Order> order) {
		this.orders = order;
	}

	
}
