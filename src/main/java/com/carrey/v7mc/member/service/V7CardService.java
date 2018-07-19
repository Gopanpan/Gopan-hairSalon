package com.carrey.v7mc.member.service;

import java.util.List;

import com.carrey.v7mc.po.V7Card;
import com.carrey.v7mc.po.V7Crecard;
import com.carrey.v7mc.queryVo.MemberQVo;

public interface V7CardService {

	/**
	 * 会员卡充值
	 * @param card
	 * @param operUser 
	 * @param handleEmployee 
	 */
	void addCardRecharge(V7Card card, String operUser, String handleEmployee);

	int getTotalAmount(MemberQVo queryVo);

	List<V7Crecard> getPageData(MemberQVo queryVo);

}
