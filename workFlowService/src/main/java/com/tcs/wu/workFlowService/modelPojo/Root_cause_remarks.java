package com.tcs.wu.workFlowService.modelPojo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Root_cause_remarks {
	
	private boolean include_crew;
	private String wf_item_type;
	private int wf_item_key;

}
