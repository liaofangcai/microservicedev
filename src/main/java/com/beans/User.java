package com.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 用户实体
 * @author lcl
 *
 */
@Entity
@Table(name = "f_user")
public class User implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 用户ID
	 */
	private Long id;
	/*
	 * 用户名
	 */
	private String name;
	/*
	 * 用户密码
	 */
	private String password;
	/*
	 * 用户头像地址
	 */
	private String iconUrl;
	/*
	 * 所在公司
	 */
	private String company;
	/*
	 * 公司地址
	 */
	private String comAddress;
	/*
	 * 行业
	 */
	private String comBusiness;
	/*
	 * 职位
	 */
	private String posation;
	/*
	 * 个人简介
	 */
	private String personal;
	/*
	 * 用户邮箱，有多个邮箱
	 */
	private List<Email> emails;
	/*
	 * 注册时间
	 */
	private Date regDate;
	/*
	 * 用户真实姓名
	 */
	private String relName;
	/*
	 * 电话
	 */
	private String phone;

	@Id
	@GeneratedValue
	@Column(name = "f_id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "f_name", unique = true, nullable = false, length = 50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "f_password", nullable = false, length = 50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "f_icon_url", nullable = false, length = 200)
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	@Column(name = "f_company", nullable = true, length = 50)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Column(name = "f_com_address", nullable = true, length = 200)
	public String getComAddress() {
		return comAddress;
	}
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}
	@Column(name ="f_com_business", nullable = true, length = 50)
	public String getComBusiness() {
		return comBusiness;
	}
	public void setComBusiness(String comBusiness) {
		this.comBusiness = comBusiness;
	}
	@Column(name = "f_posation", nullable = true, length = 50)
	public String getPosation() {
		return posation;
	}
	public void setPosation(String posation) {
		this.posation = posation;
	}
	@Column(name = "f_personal", nullable = true, length = 300)
	public String getPersonal() {
		return personal;
	}
	public void setPersonal(String personal) {
		this.personal = personal;
	}

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Email.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "f_user")
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	@Column(name = "f_date", nullable = true)
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Column(name = "f_rel_name", nullable = true, length = 50)
	public String getRelName() {
		return relName;
	}
	public void setRelName(String relName) {
		this.relName = relName;
	}
	@Column(name = "f_phone", nullable = true, length = 13)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}