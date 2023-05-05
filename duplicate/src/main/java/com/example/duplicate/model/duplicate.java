package com.example.duplicate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DuplicateDetails")
public class duplicate {

	@Id
	@GeneratedValue
	@Column(name="id")
	 private int id;
	@Override
	public String toString() {
		return "duplicate [id=" + id + ", tbfrom=" + tbfrom + ", tbookingto=" + tbookingto + ", tbookingdate="
				+ tbookingdate + ", tbookingclass=" + tbookingclass + ", tbookingcompart=" + tbookingcompart + "]";
	}
	public duplicate() {
		super();
	}
	public duplicate(int id, String tbfrom, String tbookingto, String tbookingdate, String tbookingclass,
			String tbookingcompart) {
		super();
		this.id = id;
		this.tbfrom = tbfrom;
		this.tbookingto = tbookingto;
		this.tbookingdate = tbookingdate;
		this.tbookingclass = tbookingclass;
		this.tbookingcompart = tbookingcompart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTbfrom() {
		return tbfrom;
	}
	public void setTbfrom(String tbfrom) {
		this.tbfrom = tbfrom;
	}
	public String getTbookingto() {
		return tbookingto;
	}
	public void setTbookingto(String tbookingto) {
		this.tbookingto = tbookingto;
	}
	public String getTbookingdate() {
		return tbookingdate;
	}
	public void setTbookingdate(String tbookingdate) {
		this.tbookingdate = tbookingdate;
	}
	public String getTbookingclass() {
		return tbookingclass;
	}
	public void setTbookingclass(String tbookingclass) {
		this.tbookingclass = tbookingclass;
	}
	public String getTbookingcompart() {
		return tbookingcompart;
	}
	public void setTbookingcompart(String tbookingcompart) {
		this.tbookingcompart = tbookingcompart;
	}
	@Column(name="tbfrom")
	 private String tbfrom;
	@Column(name="tbookingto")
	 private String tbookingto;
	@Column(name="tbookingdate")
	private String tbookingdate;
	@Column(name="tbookingclass")
	 private String tbookingclass;
	@Column(name="tbookingcompart")
	private String tbookingcompart;
}


