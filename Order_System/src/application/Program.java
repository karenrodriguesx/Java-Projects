package application;

import java.util.*;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			System.out.println("Hello, register a new order!\n");
			
			System.out.print("Enter the order id: ");
			int id = sc.nextInt();
			
			System.out.print("What item is being ordered? ");
			String order_number = sc.next();
			
			System.out.println("\nSuccessful order!");
			
// instanciando a classe Order para adicionar um novo pedido
			Order order = new Order (id, order_number, new Date(), OrderStatus.PENDING_PAYMENT);
			
			System.out.println(order);
	
		sc.close();
	
	}
}
