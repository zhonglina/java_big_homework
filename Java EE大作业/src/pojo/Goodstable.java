package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Goodstable",description = "商品表")
public class Goodstable {
	@ApiModelProperty(value = "用户ID")
private Integer id;
	@ApiModelProperty(value = "商品名称")
private String gname;
	@ApiModelProperty(value = "原价")
private Double goprice;
	@ApiModelProperty(value = "现价")
private Double grprice;
	@ApiModelProperty(value = "库存")
private Integer gstore;
	@ApiModelProperty(value = "图片")
private String gpicture;
	@ApiModelProperty(value = "类型")
private Integer goodstype_id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Double getGoprice() {
	return goprice;
}
public void setGoprice(Double goprice) {
	this.goprice = goprice;
}
public Double getGrprice() {
	return grprice;
}
public void setGrprice(Double grprice) {
	this.grprice = grprice;
}
public Integer getGstore() {
	return gstore;
}
public void setGstore(Integer gstore) {
	this.gstore = gstore;
}
public String getGpicture() {
	return gpicture;
}
public void setGpicture(String gpicture) {
	this.gpicture = gpicture;
}
public Integer getGoodstype_id() {
	return goodstype_id;
}
public void setGoodstype_id(Integer goodstype_id) {
	this.goodstype_id = goodstype_id;
}
@Override
public String toString() {
	return "Goodstable [id=" + id + ", gname=" + gname + ", goprice=" + goprice + ", grprice=" + grprice + ", gstore="
			+ gstore + ", gpicture=" + gpicture + ", goodstype_id=" + goodstype_id + "]";
}

}
