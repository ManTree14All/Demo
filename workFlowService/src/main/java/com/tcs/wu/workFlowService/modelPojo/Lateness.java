package com.tcs.wu.workFlowService.modelPojo;

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
public class Lateness {
	
	private int late_by_mins;
	private String ey_transport_feedback;

}
