package dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.Goodstable;

@Repository("goodstableDao")
@Mapper
public interface GoodstableDao {
	public int addGoods(Goodstable goods);
	public  int removeGoods(int id);
	public  int updateGoods(Goodstable goods);
	public List<Goodstable> selectGoods(@Param("gname") String gname);
	public List<Goodstable> selectGoodstable();
}
