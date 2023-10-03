package com.sgh.gestiondestock.model;

import java.time.Instant;
import java.util.List;

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
@Table(name = "commandeClient")
public class CommandeClient extends AbstractEntity{
	
	@Column(name = "code")
	  private String code;

	  @Column(name = "datecommande")
	  private Instant dateCommande;

	  @OneToMany(mappedBy = "commandeClient")
	  private List<ligneCommandeClient> ligneCommandeClients;

	@Column(name = "etatcommande")
	@Enumerated(EnumType.STRING)
	private EtatCommande etatCommande;

	  @ManyToOne
	  @JoinColumn(name = "idclient")
	  private Client client;
	  
	  @Column(name = "identreprise")
	  private Integer idEntreprise;



}
