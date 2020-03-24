package com.tcs.wu.workFlowService.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcs.wu.workFlowService.modelTables.Workflow_details;
import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Res_Msg;

@Repository
public interface Workflow_details_Repo extends JpaRepository<Workflow_details, Integer> {

	//finds records simply by date
	@Query(value="SELECT WORKFLOW_ID ,AIMS_CODE , CREW_ID,PM_ID ,INCIDENT_DATE ,WF_STATUS  from WORKFLOW_DETAILS w WHERE (WF_START_DATE BETWEEN ':startDate' AND ':endDate')",nativeQuery = true)
	public List<Offload_Search_Res_Msg> findByDateSimply(@Param("startDate") java.util.Date startDate,@Param("endDate") java.util.Date endDate);
	
	//finds records by date and by reference id(WorkFlowId)
	@Query(value="SELECT WORKFLOW_ID ,AIMS_CODE , CREW_ID,PM_ID ,INCIDENT_DATE ,WF_STATUS  from WORKFLOW_DETAILS w WHERE (WF_START_DATE BETWEEN ':startDate' AND ':endDate' AND (w.WORKFLOW_ID= :refId)",nativeQuery = true)
	public List<Offload_Search_Res_Msg> findByDateId(@Param("startDate") java.util.Date startDate,@Param("endDate") java.util.Date endDate,@Param("refId") int id);
	
	@Query(value="SELECT WORKFLOW_ID ,AIMS_CODE , CREW_ID,PM_ID ,INCIDENT_DATE ,WF_STATUS  from WORKFLOW_DETAILS w WHERE (WF_START_DATE BETWEEN ':startDate' AND ':endDate' AND (w.WORKFLOW_ID= :aimsCode)",nativeQuery = true)
	public List<Offload_Search_Res_Msg> findByDateCode(@Param("startDate") Date startDate,@Param("endDate") Date endDate,@Param("aimsCode") String code);
	
}
