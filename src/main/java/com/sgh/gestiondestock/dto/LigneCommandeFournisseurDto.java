package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;

import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.CommandeFournisseur;
import com.sgh.gestiondestock.model.LigneCommandeFournisseur;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {

	  private Integer id;

	  private ArticleDto article;

	  private CommandeFournisseur commandeFournisseur;

	  private BigDecimal quantite;

	  private BigDecimal prixUnitaire;

	  private Integer idEntreprise;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArticleDto getArticle() {
		return article;
	}

	public void setArticle(ArticleDto article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	  
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
	    if (ligneCommandeFournisseur == null) {
	      return null;
	    }
	    return LigneCommandeFournisseurDto.builder()
	        .id(ligneCommandeFournisseur.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
	        .quantite(ligneCommandeFournisseur.getQuantite())
	        .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
	        .idEntreprise(ligneCommandeFournisseur.getIdEntreprise())
	        .build();
	  }

	  public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto) {
	    if (dto == null) {
	      return null;
	    }

	    LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
	    ligneCommandeFournisseur.setId(dto.getId());
	    ligneCommandeFournisseur.setArticle(ArticleDto.toEntity(dto.getArticle()));
	    ligneCommandeFournisseur.setPrixUnitaire(dto.getPrixUnitaire());
	    ligneCommandeFournisseur.setQuantite(dto.getQuantite());
	    ligneCommandeFournisseur.setIdEntreprise(dto.getIdEntreprise());
	    return ligneCommandeFournisseur;
	  }
}
