package com.agile.birlasoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Specification {
	private long Specification_Id;
	private String Specification_Name;
	private String Description;
	private String Thumbnail;
	
	public Specification() {
	}
	
	public Specification(long specification_Id, String specification_Name, String description, String thumbnail) {
		super();
		Specification_Id = specification_Id;
		Specification_Name = specification_Name;
		Description = description;
		Thumbnail = thumbnail;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getSpecification_Id() {
		return Specification_Id;
	}

	public void setSpecification_Id(long specification_Id) {
		Specification_Id = specification_Id;
	}

	public String getSpecification_Name() {
		return Specification_Name;
	}

	public void setSpecification_Name(String specification_Name) {
		Specification_Name = specification_Name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getThumbnail() {
		return Thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		Thumbnail = thumbnail;
	}
}
