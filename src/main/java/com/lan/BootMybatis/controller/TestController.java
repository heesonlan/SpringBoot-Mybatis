package com.lan.BootMybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lan.BootMybatis.mapper.DemoMapper;
import com.lan.BootMybatis.model.Demo;

@RestController
public class TestController {

	@Resource
	private DemoMapper demoMapper;
	
	@RequestMapping("findAll")
	public List<Demo> findAll(){
		return demoMapper.findAll();
	}
}
