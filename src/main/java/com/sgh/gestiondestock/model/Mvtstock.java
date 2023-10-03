package com.sgh.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtStock")
public class Mvtstock extends AbstractEntity{
	  @Column(name = "datemvt")
	  private Instant dateMvt;

	  @Column(name = "quantite")
	  private BigDecimal quantite;

	  @ManyToOne
	  @JoinColumn(name = "idarticle")
	  private Article article;

	@Column(name = "typemvt")
	@Enumerated(EnumType.STRING)
	private TypeMvtstock typeMvt;

	@Column(name = "sourcemvt")
	@Enumerated(EnumType.STRING)
	private SrcMvtStock sourceMvt;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;


	  
}
