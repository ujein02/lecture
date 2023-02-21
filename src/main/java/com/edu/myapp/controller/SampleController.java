package com.edu.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.myapp.dto.SampleDTO;
import com.edu.myapp.service.SampleService;

@Controller
@RequestMapping("/sample/")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("list")
	public String sampleList(Model model) throws Exception{
		List<SampleDTO> sampleList = sampleService.sampleList();
		model.addAttribute("sampleList", sampleList);
		return "sample/list";
	}

}
