package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User",description = "�û���")
public class User {
	@ApiModelProperty(value = "���")
private Integer id;
	@ApiModelProperty(value = "�˺�")
private String account;
	@ApiModelProperty(value = "����")
private String password;
	@ApiModelProperty(value = "�������̼����")
private String name;
	@ApiModelProperty(value = "��ϵ��ʽ")
private String number;
	@ApiModelProperty(value = "��ɫ��0��ʾ��ͨ�û���1��ʾ�̼ң�2��ʾ����Ա��")
private Integer role;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public Integer getRole() {
	return role;
}
public void setRole(Integer role) {
	this.role = role;
}

}
