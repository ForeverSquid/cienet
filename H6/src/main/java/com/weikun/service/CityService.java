package com.weikun.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.weikun.vo.City;

public class CityService {
	private HashMap<String,List<City>>  map=new HashMap<String,List<City>>();
	public CityService(){
		List<City> list=new ArrayList<City> ();
		list.add(new City(1,"哈尔滨"));		
		
		list.add(new City(2,"绥化"));
		
		list.add(new City(3,"佳木斯"));
		map.put("1", list);		
		
		
		list=new ArrayList<City> ();
		list.add(new City(1,"长春"));		
		
		list.add(new City(2,"吉林"));
		
		list.add(new City(3,"白山"));
		map.put("2", list);
		
		
		
	}
	public String getCitys(String pro){
		
		List<City> list=map.get(pro);
		
		return JSONArray.toJSONString(list);
		
	}
	public static void main(String[] args) {
		System.out.println(new CityService().getCitys("2"));
	}
}
