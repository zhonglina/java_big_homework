package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import exception.UserLoginNoException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "BaseBeforeController",description = "前台用户登录权限控制")
@Controller
@RequestMapping("/before")
public class BaseBeforeController {
	
	@ModelAttribute 

	@ApiOperation(value = "判断用户是否登录")
	@RequestMapping(value = "/isLogin",method = RequestMethod.GET)
	@ResponseBody
	 public void isLogin(HttpSession session, HttpServletRequest request) throws UserLoginNoException {   
		 if(session.getAttribute("user") == null){  
	            throw new UserLoginNoException("没有登录");
	       }  
	}
}
