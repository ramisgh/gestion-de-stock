package com.sgh.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.sgh.gestiondestock.model.Client;
import com.sgh.gestiondestock.model.CommandeClient;
import com.sgh.gestiondestock.model.ligneCommandeClient;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {

	

	  private Integer id;

	  private String code;

	  private Instant dateCommande;

	  private ClientDto client;

	  private Integer idEntreprise;

	  private List<LigneCommandeClientDto> ligneCommandeClients;
	  
	  
	  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Instant getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Instant dateCommande) {
		this.dateCommande = dateCommande;
	}

	public ClientDto getClient() {
		return client;
	}

	public void setClient(ClientDto client) {
		this.client = client;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public List<LigneCommandeClientDto> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClientDto> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}

	public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
		    if (commandeClient == null) {
		      return null;
		    }
		    return CommandeClientDto.builder()
		        .id(commandeClient.getId())
		        .code(commandeClient.getCode())
		        .dateCommande(commandeClient.getDateCommande())
		        .client(ClientDto.fromEntity(commandeClient.getClient()))
		        .idEntreprise(commandeClient.getIdEntreprise())
		        .build();

		  }

		  public static CommandeClient toEntity(CommandeClientDto dto) {
		    if (dto == null) {
		      return null;
		    }
		    CommandeClient commandeClient = new CommandeClient();
		    commandeClient.setId(dto.getId());
		    commandeClient.setCode(dto.getCode());
		    commandeClient.setClient(ClientDto.toEntity(dto.getClient()));
		    commandeClient.setDateCommande(dto.getDateCommande());
		    commandeClient.setIdEntreprise(dto.getIdEntreprise());
		    return commandeClient;
		  }
}
