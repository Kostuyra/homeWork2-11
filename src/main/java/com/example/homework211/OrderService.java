package com.example.homework211;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService implements OrderServiceInterface {
	private Busket busket;


	@Override
	public List<Integer> addItems(List<Integer> ids){
		return busket.addItems(ids);}

	@Override
	public List<Integer> getItems(){
		return busket.getItems();
	}
}
