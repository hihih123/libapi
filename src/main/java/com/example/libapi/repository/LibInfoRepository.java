package com.example.libapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.libapi.domain.Libinfo;

public interface LibInfoRepository extends JpaRepository<Libinfo, Integer> {

	List<Libinfo> findByLocationOrLocation2(String location, String location2);
	
	//DB에는 도서관 정보가 조사날짜에 따라 중복 누적되어 있기 때문에 최신 조사 결과 하나만 보여줘야한다. 전화번호로 같은 도서관인지 안다. 
	@Query("SELECT p FROM #{#entityName} p WHERE LOWER(p.name) like '%'||LOWER(?1)||'%' group by p.tel")
	List<Libinfo> findByNameContaining(String name);
	
	List<Libinfo> findBySerial(Integer serial);
}
