package com.sgh.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.sgh.gestiondestock.model.Article;
import com.sgh.gestiondestock.model.Mvtstock;

import com.sgh.gestiondestock.model.SrcMvtStock;
import com.sgh.gestiondestock.model.TypeMvtstock;
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

	private TypeMvtstock typeMvt;

	private SrcMvtStock sourceMvt;

	private Integer idEntreprise;

	public static MvtStockDto fromEntity(Mvtstock mvtStk) {
		if (mvtStk == null) {
			return null;
		}

		return MvtStockDto.builder()
				.id(mvtStk.getId())
				.dateMvt(mvtStk.getDateMvt())
				.quantite(mvtStk.getQuantite())
				.article(ArticleDto.fromEntity(mvtStk.getArticle()))
				.typeMvt(mvtStk.getTypeMvt())
				.sourceMvt(mvtStk.getSourceMvt())
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
		mvtStk.setTypeMvt(dto.getTypeMvt());
		mvtStk.setSourceMvt(dto.getSourceMvt());
		mvtStk.setIdEntreprise(dto.getIdEntreprise());
		return mvtStk;
	}
}
