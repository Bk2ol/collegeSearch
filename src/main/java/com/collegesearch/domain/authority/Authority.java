package com.collegesearch.domain.authority;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.collegesearch.domain.user.User;


@Entity
@Table(name = "authorities")
@IdClass(AuthorityId.class)
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Authority implements Serializable {
	private static final long serialVersionUID = -6398259652301626438L;
	private User user;
	private Role role;
	
	protected Authority() {
		// default
	}

	public Authority(Role role) {
		this.role = role;
	}

	public Authority(User user, Role role) {
		this.user = user;
		this.role = role;
	}

	@Id
	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = false, insertable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Transient
	public int compare(Authority authority) {
		if (role.ordinal() > authority.getRole().ordinal())
			return -1;
		if (role.ordinal() < authority.getRole().ordinal())
			return 1;
		return 0;
	}

	@Transient
	public int compare(Role otherRole) {
		if (role.ordinal() > otherRole.ordinal())
			return -1;
		if (role.ordinal() < otherRole.ordinal())
			return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Authority))
			return false;
		Authority other = (Authority) obj;
		if (role != other.role)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}