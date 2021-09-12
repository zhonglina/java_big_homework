package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User",description = "用户表")
public class User {
	@ApiModelProperty(value = "编号")
private Integer id;
	@ApiModelProperty(value = "账号")
private String account;
	@ApiModelProperty(value = "密码")
private String password;
	@ApiModelProperty(value = "姓名（商家需填）")
private String name;
	@ApiModelProperty(value = "联系方式")
private String number;
	@ApiModelProperty(value = "角色（0表示普通用户，1表示商家，2表示管理员）")
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
