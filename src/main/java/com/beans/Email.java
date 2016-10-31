package com.seedyee.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户邮箱实体
 * @author lcl
 *
 */
@Entity
@Table(name = "f_email")
public class Email {
	/*
	 *id
	 */
	private Long id;
	/*
	 * 邮箱时属于哪一个用户，关联用户
	 */
	private User user;
	/*
	 * 邮箱的地址
	 */
	private String email;

	@Id
	@GeneratedValue
	@Column(name = "f_id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Column(name = "f_email", nullable = false, length = 50)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Email [id=" + id + ", user=" + user + ", email=" + email + "]";
	}

}
