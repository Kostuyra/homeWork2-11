package com.example.homework211;


import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/order")

public class OrderController {
	private final OrderServiceInterface orderServiceInterface;

	public OrderController(OrderServiceInterface orderServiceInterface) {
		this.orderServiceInterface = orderServiceInterface;
	}


	@GetMapping("/add")
	List<Integer> addItem(@RequestParam() List<Integer> ids) {
		return orderServiceInterface.addItems(ids);
	}

	@GetMapping("/get")
	List<Integer> getItems() {
		return orderServiceInterface.getItems();
	}
}
