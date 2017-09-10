package com.example.libapi.service;

import java.util.List;

import com.example.libapi.domain.Libinfo;

public interface LibInfoService {

	List<Libinfo> findByLocation(String location);
	List<Libinfo> findByName(String name);
	List<Libinfo> findBySerial(int serial);
}
