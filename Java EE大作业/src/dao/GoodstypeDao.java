package dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.Goodstype;

@Repository("goodstypeDao")
@Mapper
public interface GoodstypeDao {
public int addGoodstype(Goodstype goodstype);
public int deleteGoodstype(int id);
public int updateGoodstype(Goodstype goodstype);
public List<Goodstype> selectGoodstype();
}
