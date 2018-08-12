package com.example.demo.business.role.rest;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  RoleController
 *
 * @version : Ver 1.0
 * @date	: 2018-7-12
 */
@RestController
@Api(value = "RoleController", description = "功能权限相关")
@RequestMapping(value = "/role")
public class RoleController { 
	
	   @InitBinder   
	    public void initBinder(WebDataBinder binder) {   
	        DateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
	        dateFormat.setLenient(true);   
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   
	    }  
	

	
	@ApiOperation(value = "新增功能权限", notes = "新增功能权限")
	@RequestMapping(value = "/insertRole", method = RequestMethod.POST)
	public int insertRole(@RequestBody String role){

		return 1;
	}



}
