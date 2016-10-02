package com.collegesearch.domain.user;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.collegesearch.domain.authority.Authority;
import com.collegesearch.domain.authority.Role;


@Entity
@Table(name = "users")
@DynamicUpdate
@DynamicInsert
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User implements Serializable {
    private static final long serialVersionUID = -321397721787L;
	private Integer userId;
	private String username;
	private String password;
	private String email;
	private Date dateEnabled;
	private Date dateDisabled;
	private boolean enabled;
	private Collection<Authority> roles = new HashSet<Authority>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	//@Override
	@Column(name = "username", unique = true)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//@Override
	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "enabled", columnDefinition = "BOOLEAN")
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
/*
	@Column(name = "date_enabled")
	public Date getDateEnabled() {
		return this.dateEnabled;
	}

	public void setDateEnabled(
			Date dateEnabled) {
		this.dateEnabled = dateEnabled;
	}

	@Column(name = "date_disabled")
	public Date getDateDisabled() {
		return this.dateDisabled;
	}

	public void setDateDisabled(
			Date dateDisabled) {
		this.dateDisabled = dateDisabled;
	}
*/
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade=CascadeType.ALL)
	public Collection<Authority> getRoles() {
		return this.roles;
	}

	public void setRoles(Collection<Authority> roles) {
		this.roles = roles;
	}

	/********************************************************************************************************************************
	 * Begins Spring UserDetails implementation methods. User class should not implement UserDetails, instead we should
	 * create another class that uses Assembler to keep our design separate from Spring.
	 ********************************************************************************************************************************/

	private Collection<GrantedAuthority> grantedAuthorities;

	@Transient
	//@Override
	public Collection<GrantedAuthority> getAuthorities() {
		if (grantedAuthorities == null) {
			grantedAuthorities = new HashSet<GrantedAuthority>();
			for (Authority authority : getRoles()) {
				grantedAuthorities.add(new SimpleGrantedAuthority(authority.getRole().toString()));
			}
		}
		return grantedAuthorities;
	}

	@Transient
	//@Override
	public boolean isAccountNonExpired() {
		return isEnabled();
	}

	@Transient
	//@Override
	public boolean isAccountNonLocked() {
		return isEnabled();
	}

	@Transient
	//@Override
	public boolean isCredentialsNonExpired() {
		return isEnabled();
	}

	@Transient
	public Authority getGreatestAuthority() {
		Authority greatestRole = new Authority(Role.ROLE_ANONYMOUS);
		for (Authority auth : getRoles())
			if (greatestRole.compare(auth) < 0)
				greatestRole = auth;
		return greatestRole;
	}

	@Transient
	public boolean isInternalUser() {
		Set<Role> internalRoles = new HashSet<Role>(Arrays.asList(Role.getInternalRoles()));

		for (Authority auth : getRoles())
			if (internalRoles.contains(auth.getRole()))
				return true;

		return false;
	}

	@Transient
	public boolean isUser() {
		return getRoles().contains(new Authority(Role.ROLE_USER));
	}

	@Transient 
	public void clearPassword(){
		this.password = null;
	}
/*	@Transient
	public boolean isAuthenticated() {
		Authentication authentication = UserManager.securityContext.getContext().getAuthentication();
		return authentication != null && authentication.getPrincipal() instanceof UserDetails;
	}
*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	@Transient
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", dateEnabled=" + dateEnabled + ", dateDisabled=" + dateDisabled
				+ ", enabled=" + enabled + ", authorities=" + grantedAuthorities + "]";
	}
	
	@Transient
	public String toShortString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + "]";
	}
}