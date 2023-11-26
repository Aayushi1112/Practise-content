package com.policy.creation.MongoExample.passwordPolicy;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Data
@Document
public class PasswordPolicy {

	@Id
	private String id;
	private String tenantId;
	private PasswordPolicyRules passwordPolicyRules;
	private Date createdOn;
	private Date updatedOn;
	private String paSystem;
}
