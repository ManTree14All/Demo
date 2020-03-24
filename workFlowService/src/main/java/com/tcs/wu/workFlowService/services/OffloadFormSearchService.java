package com.tcs.wu.workFlowService.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.wu.workFlowService.dao.OffloadFormSearchDAO;
import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Req_Msg;
import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Res_Msg;

@Service
public class OffloadFormSearchService {
	
	@Autowired
	private OffloadFormSearchDAO dao;

	public List<Offload_Search_Res_Msg> searchOffloadFormRecords(Offload_Search_Req_Msg offload_Search_Req_Msg) {
		
		return dao.searchOffloadFormRecords(offload_Search_Req_Msg);
	}

}
