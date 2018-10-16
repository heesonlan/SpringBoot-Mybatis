package com.lan.BootMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lan.BootMybatis.model.Demo;
@Mapper
public interface DemoMapper {
	List<Demo> findAll();
}