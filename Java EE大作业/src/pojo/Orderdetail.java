package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Orderdetail",description = "订单详情表")
public class Orderdetail {
	@ApiModelProperty(value = "编号")
private Integer id;
	@ApiModelProperty(value = "订单编号")
private Integer orderbase_id;
	@ApiModelProperty(value = "商品编号")
private Integer goodstable_id;
	@ApiModelProperty(value = "购买数量")
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
