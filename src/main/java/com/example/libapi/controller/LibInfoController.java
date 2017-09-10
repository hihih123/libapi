package com.example.libapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.libapi.domain.Libinfo;
import com.example.libapi.service.LibInfoService;

@RestController
public class LibInfoController {

	@Autowired
	LibInfoService libInfoService;
	
	//GET http://localhost:8080/library/locations/{지명} , 도시구군 이름
	
	@RequestMapping(value="/library/locations/{location}", method = RequestMethod.GET)
	public List<Libinfo> byLocation(@PathVariable String location){
		
		return libInfoService.findByLocation(location);
	}
	
	//GET http://localhost:8080/library/names/{도서관이름}
	
	@RequestMapping(value="/library/names/{name}", method = RequestMethod.GET)
	public List<Libinfo> byName(@PathVariable String name){
		
		return libInfoService.findByName(name);
	}
	
	//GET http://localhost:8080/library/id/{도서관번호}

	@RequestMapping(value="/library/id/{serial}", method = RequestMethod.GET)
	public List<Libinfo> byName(@PathVariable int serial){
		
		return libInfoService.findBySerial(serial);
	}
}
