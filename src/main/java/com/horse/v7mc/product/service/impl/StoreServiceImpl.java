package com.horse.v7mc.product.service.impl;

import java.util.List;

import com.horse.v7mc.mapperInterface.V7StoreQuantityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horse.v7mc.po.V7StoreQuantity;
import com.horse.v7mc.product.service.StoreService;
import com.horse.v7mc.queryVo.StoreQVo;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private V7StoreQuantityMapper quantityMapper;
	
	@Override
	public int getTotalAmount(StoreQVo queryVo) {
		return quantityMapper.getTotalAmount(queryVo);
	}

	@Override
	public List<V7StoreQuantity> getPageData(StoreQVo queryVo) {
		return quantityMapper.getPageData(queryVo);
	}

}
