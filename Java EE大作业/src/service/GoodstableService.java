package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GoodstableDao;
import dao.UserDao;
import pojo.Goodstable;

@Service
public class GoodstableService {
	@Autowired
	private GoodstableDao goodstableDao;
	public int addGoods(Goodstable goods) {
		return goodstableDao.addGoods(goods);
	}
	public  int removeGoods(int id) {
		return goodstableDao.removeGoods(id);
	}
	public  int updateGoods(Goodstable goods) {
		return goodstableDao.updateGoods(goods);
	}
	public List<Goodstable> selectGoods(String name) {
		String gname="%"+name+"%";
		return goodstableDao.selectGoods(gname);
	}
	public List<Goodstable> selectGoodstable(){
		return goodstableDao.selectGoodstable();
	}
	}
