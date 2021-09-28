package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(name = "NOMBRE", length = 100, nullable = false)
	@NotEmpty
	private String nombre;

	@Column(name = "APAT", length = 100, nullable = false)
	@NotEmpty
	private String apat;

	@Column(name = "AMAT", length = 100, nullable = false)
	@NotEmpty
	private String amat;

	@Column(name = "TELEFONO", length = 100, nullable = false)
	@NotEmpty
	private String tel;

	@Column(name = "DIRECCION", length = 500, nullable = false)
	@NotEmpty
	private String direccion;

	@Column(name = "EMAIL", length = 100, nullable = false)
	@NotEmpty
	@Email
	private String email;

	@Column(name = "USUARIO", length = 100, nullable = false)
	@NotEmpty
	private String usuario;

	@Column(name = "CONTRASEÑA", length = 100, nullable = false)
	@NotEmpty
	private String contrasenia;

	@Column(name = "ACTIVO", length = 100, nullable = false)
	@NotEmpty
	private String activo;

	@NotNull
	@Column(name = "CREATE_AT")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createAt;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApat() {
		return apat;
	}

	public void setApat(String apat) {
		this.apat = apat;
	}

	public String getAmat() {
		return amat;
	}

	public void setAmat(String amat) {
		this.amat = amat;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
