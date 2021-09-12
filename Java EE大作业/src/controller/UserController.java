package controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import pojo.Result;
import pojo.User;
import service.UserService;

@Api(tags = "UserController",description = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "查询全部用户")
	@RequestMapping(value = "/selectAllUser",method = RequestMethod.POST)
	@ResponseBody
	public Result selectAllUser(){
		List<User> infos=userService.selectAllUser();
		return new Result(0, "", infos);
	}
	
	@ApiOperation(value = "用户注册")
	@RequestMapping(value = "/userregister",method = RequestMethod.POST)
	@ResponseBody
	public Result Userregister(@RequestBody User user) {
		int rt = userService.Userregister(user);
		return new Result(0, "", String.format("添加数据：%d 条", rt));
		
	} 
	@ApiOperation(value = "商家注册")
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	@ResponseBody
	public Result register(@RequestBody User user) {
		int rt = userService.Merchantregister(user);
		return new Result(0, "", String.format("添加数据：%d 条", rt));
		
	} 
	@ApiOperation(value = "登录")
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public Result Login(@RequestBody User user, HttpSession session, BindingResult errors) {

		if (errors.hasErrors()) {
			session.invalidate();// 清楚之前的登录信息
			return new Result(0, "缺少参数", "登录失败111");
		}
		try {
			user = userService.login(user);
		}
		catch(NullPointerException e) {
			session.invalidate();// 清楚之前的登录信息
			return new Result(0, "缺少参数", "登录失败");
		} 
		catch (Exception e) {
			session.invalidate();// 清楚之前的登录信息
			return new Result(0, e.getMessage(), "登录失败");
		}
		session.setAttribute("user", user);
		return new Result(0, "", "登录成功");
	}
	@ApiOperation(value = "修改密码")
	@RequestMapping(value = "/updateUserPassword",method = RequestMethod.POST)
	@ResponseBody
	public Result updateUserPassword(@RequestBody User user) {
		int rt = userService.updateUserPassword(user);
		return new Result(0, "", String.format("更新数据：%d 条", rt));
	}
	@ApiOperation(value = "删除用户")
	@RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
	@ResponseBody
	public Result deleteUser(@RequestBody String account) {
		int rt=userService.deleteUser(account);
		return new Result(0, "", String.format("删除数据：%d 条", rt));
	}
	
	
}