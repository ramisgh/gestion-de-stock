package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;

import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.Catogorie;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	
	 private Integer id;

	  private String codeArticle;

	  private String designation;

	  private BigDecimal prixUnitaireHt;

	  private BigDecimal tauxTva;

	  private BigDecimal prixUnitaireTtc;

	  private String photo;

	  private CatogorieDto category;

	  private Integer idEntreprise;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHt() {
		return prixUnitaireHt;
	}

	public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getPrixUnitaireTtc() {
		return prixUnitaireTtc;
	}

	public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
		this.prixUnitaireTtc = prixUnitaireTtc;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public CatogorieDto getCategory() {
		return category;
	}

	public void setCategory(CatogorieDto category) {
		this.category = category;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	

	  public static ArticleDto fromEntity(Article article) {
	    if (article == null) {
	      return null;
	    }
	    return ArticleDto.builder()
	        .id(article.getId())
	        .codeArticle(article.getCodeArticle())
	        .designation(article.getDesignation())
	        .photo(article.getPhoto())
	        .prixUnitaireHt(article.getPrixUnitaireHt())
	        .prixUnitaireTtc(article.getPrixUnitaireTtc())
	        .tauxTva(article.getTauxTva())
	        .idEntreprise(article.getIdEntreprise())
	        .category(CatogorieDto.fromEntity(article.getCategory()))
	        .build();
	  }

	  public static Article toEntity(ArticleDto articleDto) {
	    if (articleDto == null) {
	      return null;
	    }
	    Article article = new Article();
	    article.setId(articleDto.getId());
	    article.setCodeArticle(articleDto.getCodeArticle());
	    article.setDesignation(articleDto.getDesignation());
	    article.setPhoto(articleDto.getPhoto());
	    article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
	    article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
	    article.setTauxTva(articleDto.getTauxTva());
	    article.setIdEntreprise(articleDto.getIdEntreprise());
	    article.setCategory(CatogorieDto.toEntity(articleDto.getCategory()));
	    return article;
	  }
}
