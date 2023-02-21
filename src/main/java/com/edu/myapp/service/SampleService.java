package com.edu.myapp.service;

import java.util.List;

import com.edu.myapp.dto.SampleDTO;

public interface SampleService {
	
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;

}
