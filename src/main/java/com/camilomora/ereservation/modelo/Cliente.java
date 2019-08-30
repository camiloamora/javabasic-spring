/**
 * 
 */
package com.camilomora.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la table cliente
 * @author Camilo Mora
 *
 */

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String identificacionCliente;
	private String direccionCliente;
	private String telefinoCliente;
	private String emailCliente;
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		
	}
}
