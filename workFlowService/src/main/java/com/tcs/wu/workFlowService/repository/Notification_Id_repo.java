package com.tcs.wu.workFlowService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.wu.workFlowService.modelTables.Notification_Id;

@Repository
public interface Notification_Id_repo extends JpaRepository<Notification_Id, Integer>{

}
