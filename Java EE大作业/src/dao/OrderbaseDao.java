package dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.Orderbase;

@Repository("orderbaseDao")
@Mapper
public interface OrderbaseDao {
	public int addOrderbase(Orderbase orderbase);
	public int havepay(Orderbase orderbase);
	public int havereceive(Orderbase orderbase);
	public int cancelOrder(Orderbase orderbase);
	public List<Orderbase> selectOrderbase();
}
