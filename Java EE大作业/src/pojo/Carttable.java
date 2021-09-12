package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Carttable",description = "购物车表")
public class Carttable {
	@ApiModelProperty(value = "购物车ID")
private Integer id;
	@ApiModelProperty(value = "用户账号")
private String user_account;
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
public String getUser_account() {
	return user_account;
}
public void setUser_account(String user_account) {
	this.user_account = user_account;
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
