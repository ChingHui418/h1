package tw.hui.hi.tutor;

import java.util.List;

import tw.hui.h1.entity.Order;
import tw.hui.h1.entity.OrderItem;
import tw.hui.h1.service.OrderService;
import tw.hui.h1.service.OrderServiceImp;

public class Hui13 {

	public static void main(String[] args) {
		OrderService service = new OrderServiceImp();
		
		service.addItem(1L, "item1", 4, 100);
		service.addItem(1L, "item2", 5, 600);
		service.addItem(1L, "item3", 7, 500);
		service.addItem(1L, "item4", 14, 1000);
		
	}

}
