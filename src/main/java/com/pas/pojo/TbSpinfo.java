package com.pas.pojo;
public class TbSpinfo implements java.io.Serializable {
	private Integer id;
	private String spname;
	private String cd;
	private String gg;
	private String ph;
	private String gysname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpname() {
		return spname;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getGg() {
		return gg;
	}

	public void setGg(String gg) {
		this.gg = gg;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getGysname() {
		return gysname;
	}

	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
}