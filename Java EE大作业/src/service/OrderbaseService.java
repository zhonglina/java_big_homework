package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderbaseDao;
import pojo.Orderbase;
@Service
public class OrderbaseService {
	@Autowired
	private OrderbaseDao orderbaseDao;
	public int addOrderbase(Orderbase orderbase) {
		return orderbaseDao.addOrderbase(orderbase);
	}
	public int havepay(Orderbase orderbase) {
		return orderbaseDao.havepay(orderbase);
	}
	public int havereceive(Orderbase orderbase) {
		return orderbaseDao.havereceive(orderbase);
	}
	public int cancelOrder(Orderbase orderbase) {
		return orderbaseDao.cancelOrder(orderbase);
	}
	public List<Orderbase> selectOrderbase(){
		return orderbaseDao.selectOrderbase();
	}
}
