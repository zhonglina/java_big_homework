package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Carttable",description = "���ﳵ��")
public class Carttable {
	@ApiModelProperty(value = "���ﳵID")
private Integer id;
	@ApiModelProperty(value = "�û��˺�")
private String user_account;
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
