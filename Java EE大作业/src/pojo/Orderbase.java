package pojo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "Orderbase",description = "����������")
public class Orderbase {
	@ApiModelProperty(value = "�������")
private Integer id;
	@ApiModelProperty(value = "�û��˺�")
private Integer user_account;
	@ApiModelProperty(value = "���")
private Integer amount;
	@ApiModelProperty(value = "����״̬��0Ϊ�Ѹ��1Ϊδ����,2��ȡ��������")
private Integer state;
	@ApiModelProperty(value = "�µ�ʱ��")
private Date ordertime;
	@ApiModelProperty(value = "����״̬��0�̼��ѽӵ���1���������У�2���ջ���")
private Integer receive;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUser_account() {
	return user_account;
}
public void setUser_account(Integer user_account) {
	this.user_account = user_account;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Date getOrdertime() {
	return ordertime;
}
public void setOrdertime(Date ordertime) {
	this.ordertime = ordertime;
}
public Integer getReceive() {
	return receive;
}
public void setReceive(Integer receive) {
	this.receive = receive;
}

}
