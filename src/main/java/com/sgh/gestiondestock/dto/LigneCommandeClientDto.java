package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.CommandeClient;
import com.sgh.gestiondestock.model.ligneCommandeClient;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {

	private Integer id;

	  private ArticleDto article;

	  @JsonIgnore
	  private CommandeClientDto commandeClient;

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

	public CommandeClientDto getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClientDto commandeClient) {
		this.commandeClient = commandeClient;
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
	  

	  public static LigneCommandeClientDto fromEntity(ligneCommandeClient ligneCommandeClient) {
	    if (ligneCommandeClient == null) {
	      return null;
	    }
	    return LigneCommandeClientDto.builder()
	        .id(ligneCommandeClient.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeClient.getArticle()))
	        .quantite(ligneCommandeClient.getQuantite())
	        .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
	        .idEntreprise(ligneCommandeClient.getIdEntreprise())
	        .build();
	  }

	  public static ligneCommandeClient toEntity(LigneCommandeClientDto dto) {
	    if (dto == null) {
	      return null;
	    }

	    ligneCommandeClient ligneCommandeClient = new ligneCommandeClient();
	    ligneCommandeClient.setId(dto.getId());
	    ligneCommandeClient.setArticle(ArticleDto.toEntity(dto.getArticle()));
	    ligneCommandeClient.setPrixUnitaire(dto.getPrixUnitaire());
	    ligneCommandeClient.setQuantite(dto.getQuantite());
	    ligneCommandeClient.setIdEntreprise(dto.getIdEntreprise());
	    return ligneCommandeClient;
	  }
}
