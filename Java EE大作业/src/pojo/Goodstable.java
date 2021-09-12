package pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Goodstable",description = "��Ʒ��")
public class Goodstable {
	@ApiModelProperty(value = "�û�ID")
private Integer id;
	@ApiModelProperty(value = "��Ʒ����")
private String gname;
	@ApiModelProperty(value = "ԭ��")
private Double goprice;
	@ApiModelProperty(value = "�ּ�")
private Double grprice;
	@ApiModelProperty(value = "���")
private Integer gstore;
	@ApiModelProperty(value = "ͼƬ")
private String gpicture;
	@ApiModelProperty(value = "����")
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
