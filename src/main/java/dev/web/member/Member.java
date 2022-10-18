package dev.web.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;

	@Column
	private String userid;
	private String passwd;
	private String username;

	public Member() {
	}

	public Member(String userid, String passwd, String username) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
	}

	public Member(int num, String userid, String passwd, String username) {
		this.num = num;
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}