package com.horse.v7mc.cashier.controller;

import java.util.List;

import com.horse.v7mc.employee.service.EmployeeService;
import com.horse.v7mc.po.V7Results;
import com.horse.v7mc.queryVo.ResultsQVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.horse.v7mc.cashier.service.ResultsService;
import com.horse.v7mc.common.Constant;
import com.horse.v7mc.common.pageBean.PageUtils;

@Controller
@RequestMapping("/results")
public class ResultsController {
	@Autowired
	private ResultsService resultsService;
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 业绩数据
	 * @param model
	 * @return
	 */
	@RequestMapping("/resultsList")
	public String resultsList(Model model, ResultsQVo queryVo){
		
		int recordCount = resultsService.getTotalAmount(queryVo);
		queryVo = (ResultsQVo) PageUtils.getPageInfo(recordCount,queryVo);
		List<V7Results> pageData = resultsService.getPageData(queryVo);
		queryVo.setRecoredList(pageData);
		model.addAttribute(Constant.CONTROlLER_RETURN_ATTRNAME, queryVo);
		
		return "memberOrfront/results-list";
	}

	
}
