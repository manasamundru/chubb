package com.OneToMany.request;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tutorials {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tutorials_id;
	public int getId() {
		return tutorials_id;
	}
	public void setId(int tutorials_id) {
		this.tutorials_id = tutorials_id;
	}
	String title;
	String description;
	boolean published;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	

}
