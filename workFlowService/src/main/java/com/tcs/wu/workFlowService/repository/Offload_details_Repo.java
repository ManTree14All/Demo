package com.tcs.wu.workFlowService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.wu.workFlowService.modelTables.Offload_details;

@Repository
public interface Offload_details_Repo extends JpaRepository<Offload_details, Integer> {

}
