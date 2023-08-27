package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.Mvtstock;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStockDto {

	 private Integer id;

	  private Instant dateMvt;

	  private BigDecimal quantite;

	  private ArticleDto article;

	  private Integer idEntreprise;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Instant dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public ArticleDto getArticle() {
		return article;
	}

	public void setArticle(ArticleDto article) {
		this.article = article;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public static MvtStockDto fromEntity(Mvtstock mvtStk) {
	    if (mvtStk == null) {
	      return null;
	    }

	    return MvtStockDto.builder()
	        .id(mvtStk.getId())
	        .dateMvt(mvtStk.getDateMvt())
	        .quantite(mvtStk.getQuantite())
	        .article(ArticleDto.fromEntity(mvtStk.getArticle()))
	        .idEntreprise(mvtStk.getIdEntreprise())
	        .build();
	  }

	  public static Mvtstock toEntity(MvtStockDto dto) {
	    if (dto == null) {
	      return null;
	    }

	    Mvtstock mvtStk = new Mvtstock();
	    mvtStk.setId(dto.getId());
	    mvtStk.setDateMvt(dto.getDateMvt());
	    mvtStk.setQuantite(dto.getQuantite());
	    mvtStk.setArticle(ArticleDto.toEntity(dto.getArticle()));
	    mvtStk.setIdEntreprise(dto.getIdEntreprise());
	    return mvtStk;
	  }

}
