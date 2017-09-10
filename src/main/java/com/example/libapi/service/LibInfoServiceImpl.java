package com.example.libapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libapi.domain.Libinfo;
import com.example.libapi.repository.LibInfoRepository;

@Service
public class LibInfoServiceImpl implements LibInfoService {

	@Autowired
	LibInfoRepository libInfoRepository;
	
	@Override
	public List<Libinfo> findByLocation(String location) {

		return libInfoRepository.findByLocationOrLocation2(location, location);
	}
	
	@Override
	public List<Libinfo> findByName(String name) {

		return libInfoRepository.findByNameContaining(name);
	}

	@Override
	public List<Libinfo> findBySerial(int serial) {

		return libInfoRepository.findBySerial(serial);
	}
	

}
