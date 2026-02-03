package tw.hui.hi.tutor;

import java.util.List;

import tw.hui.h1.entity.OrderItem;
import tw.hui.h1.service.OrderService;
import tw.hui.h1.service.OrderServiceImp;

public class Hui11 {

	public static void main(String[] args) {
		OrderService service = new OrderServiceImp();
//		Long id = service.createOrder("Tony");
//		System.out.println(id);
		
		 List<OrderItem> items = List.of(new OrderItem("item1", 7, 100),
		 		new OrderItem("item2", 4, 430),
		 		new OrderItem("item4", 2, 50));
		 Long id = service.createOrderWithItems("Kevin", items);
		 
		 System.out.println(id);
	}

}
