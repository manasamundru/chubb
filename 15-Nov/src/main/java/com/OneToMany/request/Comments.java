package com.OneToMany.request;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	String content;
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "tutorials_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Tutorials tutorial;
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getContent() {
		 return content;
	 }
	 public void setContent(String content) {
		 this.content = content;
	 }
	 public Tutorials getTutorial() {
		 return tutorial;
	 }
	 public void setTutorial(Tutorials tutorial) {
		 this.tutorial = tutorial;
	 }
	
    
}
