package com.collegesearch.domain.authority;

import java.io.Serializable;

import com.collegesearch.domain.user.User;



public class AuthorityId implements Serializable {
  private static final long serialVersionUID = 7740332242823859489L;
  private User user;
  private Role Role;

  protected AuthorityId() {
    // do nothing
  }

  public AuthorityId(User user, Role Role) {
    this.user = user;
    this.Role = Role;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Role getRole() {
    return this.Role;
  }

  public void setRole(Role Role) {
    this.Role = Role;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Role == null) ? 0 : Role.hashCode());
    result = prime * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AuthorityId other = (AuthorityId) obj;
    if (Role == null) {
      if (other.Role != null)
        return false;
    } else if (!Role.equals(other.Role))
      return false;
    if (user == null) {
      if (other.user != null)
        return false;
    } else if (!user.equals(other.user))
      return false;
    return true;
  }
}