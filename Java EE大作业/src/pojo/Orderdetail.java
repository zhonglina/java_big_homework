package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Orderdetail",description = "���������")
public class Orderdetail {
	@ApiModelProperty(value = "���")
private Integer id;
	@ApiModelProperty(value = "�������")
private Integer orderbase_id;
	@ApiModelProperty(value = "��Ʒ���")
private Integer goodstable_id;
	@ApiModelProperty(value = "��������")
private Integer shoppingnum;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getOrderbase_id() {
	return orderbase_id;
}
public void setOrderbase_id(Integer orderbase_id) {
	this.orderbase_id = orderbase_id;
}
public Integer getGoodstable_id() {
	return goodstable_id;
}
public void setGoodstable_id(Integer goodstable_id) {
	this.goodstable_id = goodstable_id;
}
public Integer getShoppingnum() {
	return shoppingnum;
}
public void setShoppingnum(Integer shoppingnum) {
	this.shoppingnum = shoppingnum;
}

}
