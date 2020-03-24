package com.tcs.wu.workFlowService.modelPojo;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Medical_osi_details {
	
	private String nature_of_sickness;
	private Date eamc_visit_date;
	private String eamc_feedback;

}
