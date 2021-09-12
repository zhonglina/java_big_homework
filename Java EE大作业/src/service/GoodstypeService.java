package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GoodstypeDao;
import pojo.Goodstype;


@Service
public class GoodstypeService {
	@Autowired
	private GoodstypeDao goodstypeDao;
	public int addGoodstype(Goodstype goodstype) {
		return goodstypeDao.addGoodstype(goodstype);
	}
	public int deleteGoodstype(int id) {
		return goodstypeDao.deleteGoodstype(id);
	}
	public int updateGoodstype(Goodstype goodstype) {
		return goodstypeDao.updateGoodstype(goodstype);
	}
	public List<Goodstype> selectGoodstype(){
		return goodstypeDao.selectGoodstype();
	}
}
