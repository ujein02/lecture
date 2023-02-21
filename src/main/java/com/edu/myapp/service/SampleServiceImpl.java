package com.edu.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.myapp.dao.SampleDAO;
import com.edu.myapp.dto.SampleDTO;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDAO sampleDAO;
	
	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDAO.sampleList();
	}

	@Override
	public SampleDTO getSample(String id) throws Exception {
		return sampleDAO.getSample(id);
	}
	
	
	
}
