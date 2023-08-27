package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;

import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.LigneVentes;
import com.sgh.gestiondestock.model.Ventes;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVentesDto {

	  private Integer id;
	  private VentesDto vente;

	  private BigDecimal quantite;

	  private BigDecimal prixUnitaire;

	  private Integer idEntreprise;
	  private ArticleDto article;
	  
	  public static LigneVentesDto fromEntity(LigneVentes ligneVente) {
		    if (ligneVente == null) {
		      return null;
		    }

		    return LigneVentesDto.builder()
		        .id(ligneVente.getId())
		        .vente(VentesDto.fromEntity(ligneVente.getVente()))
		        .article(ArticleDto.fromEntity(ligneVente.getArticle()))
		        .quantite(ligneVente.getQuantite())
		        .prixUnitaire(ligneVente.getPrixUnitaire())
		        .idEntreprise(ligneVente.getIdEntreprise())
		        .build();
		  }

		  public static LigneVentes toEntity(LigneVentesDto dto) {
		    if (dto == null) {
		      return null;
		    }
		    LigneVentes ligneVente = new LigneVentes();
		    ligneVente.setId(dto.getId());
		    ligneVente.setVente(VentesDto.toEntity(dto.getVente()));
		    ligneVente.setArticle(ArticleDto.toEntity(dto.getArticle()));
		    ligneVente.setQuantite(dto.getQuantite());
		    ligneVente.setPrixUnitaire(dto.getPrixUnitaire());
		    ligneVente.setIdEntreprise(dto.getIdEntreprise());
		    return ligneVente;
		  }

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public VentesDto getVente() {
			return vente;
		}

		public void setVente(VentesDto vente) {
			this.vente = vente;
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

		public ArticleDto getArticle() {
			return article;
		}

		public void setArticle(ArticleDto article) {
			this.article = article;
		}

		  
}
