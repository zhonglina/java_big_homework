package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Goodstype",description = "商品类型表")
public class Goodstype {
	@ApiModelProperty(value = "类型编号")
private Integer id;
	@ApiModelProperty(value = "类型名称")
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
