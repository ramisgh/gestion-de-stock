package com.sgh.gestiondestock.model;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
	
	 @Id
	  @GeneratedValue
	  private Integer id;

	  @CreatedDate
	  @Column(name = "creationDate", nullable = false, updatable = false)
	  private Instant creationDate;

	  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public Instant getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Instant lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@LastModifiedDate
	  @Column(name = "lastModifiedDate")
	  private Instant lastModifiedDate;

}
