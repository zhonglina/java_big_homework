package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Goodstype",description = "��Ʒ���ͱ�")
public class Goodstype {
	@ApiModelProperty(value = "���ͱ��")
private Integer id;
	@ApiModelProperty(value = "��������")
private String typename;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTypename() {
	return typename;
}
public void setTypename(String typename) {
	this.typename = typename;
}

}
