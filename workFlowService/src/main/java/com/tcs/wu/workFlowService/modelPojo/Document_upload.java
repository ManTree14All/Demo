package com.tcs.wu.workFlowService.modelPojo;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import javassist.bytecode.ByteArray;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Document_upload {
	
	private String doc_name;
	private String doc_type;
	private Timestamp date;
	private String Description;
	private ByteArray Doc_bytes;  //
}
