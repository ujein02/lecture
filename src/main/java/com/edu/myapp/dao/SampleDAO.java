package com.edu.myapp.dao;

import java.util.List;

import com.edu.myapp.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;

}
