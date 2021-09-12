package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pojo.Orderbase;
import pojo.Result;
import service.OrderbaseService;

@Api(tags = "OrderbaseController",description = "订单管理")
@Controller
@RequestMapping("/orderbase")
public class OrderbaseController {
	@Autowired
	private OrderbaseService  orderbaseService;
	
	@ApiOperation(value = "新增订单")
	@RequestMapping(value = "/addOrderbase",method = RequestMethod.POST)
	@ResponseBody
	public Result addOrderbase(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.addOrderbase(orderbase);
		return new Result(0, "", String.format("添加数据：%d 条", rt));
	}
	@ApiOperation(value = "更新订单状态（用户付款）")
	@RequestMapping(value = "/havepay",method = RequestMethod.POST)
	@ResponseBody
	public Result havepay(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.havepay(orderbase);
		return new Result(0, "", String.format("更新数据：%d 条", rt));
	}
	@ApiOperation(value = "更新订单状态（确认收货）")
	@RequestMapping(value = "/haverecive",method = RequestMethod.POST)
	@ResponseBody
	public Result haverecive(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.havereceive(orderbase);
		return new Result(0, "", String.format("更新数据：%d 条", rt));
	}
	@ApiOperation(value = "更新订单状态（取消订单）")
	@RequestMapping(value = "/cancelOrder",method = RequestMethod.POST)
	@ResponseBody
	public Result cancelOrder(@RequestBody Orderbase orderbase) {
		int rt=orderbaseService.cancelOrder(orderbase);
		return new Result(0, "", String.format("更新数据：%d 条", rt));
	}
	@ApiOperation(value = "查看订单")
	@RequestMapping(value = "/selectOrderbase",method = RequestMethod.POST)
	@ResponseBody
	public Result selectOrderbase(){
		List<Orderbase> infos=orderbaseService.selectOrderbase();
		return new Result(0, "", infos);
	}
}
