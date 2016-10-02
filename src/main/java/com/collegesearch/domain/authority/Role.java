package com.collegesearch.domain.authority;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public enum Role implements Serializable {
	
	ROLE_SUPERUSER("Superuser"), 
	ROLE_ADMIN("Administrator"), 
	ROLE_MANAGER("Manager"), 
	ROLE_USER("User"), 
	ROLE_UNPAYED_USER("UnpayedUser"), 
	ROLE_ANONYMOUS("Anonymous");

	private String name;

	private Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*public static List<String> getRolesAbove(Role role, boolean eq) {
		List<String> greaterRoles = new ArrayList<String>();
		for (Role r : Role.values())
			if (r.ordinal() <= role.ordinal()) {
				if (eq)
					greaterRoles.add(r.name);
				else if (r.ordinal() < role.ordinal())
					greaterRoles.add(r.name);
			}

		return greaterRoles;
	}
	*/
	public static List<Role> getRolesAbove(Role role, boolean eq) {
		List<Role> greaterRoles = new ArrayList<Role>();
		for (Role r : Role.values())
			if (r.ordinal() <= role.ordinal()) {
				if (eq)
					greaterRoles.add(r);
				else if (r.ordinal() < role.ordinal())
					greaterRoles.add(r);
			}

		return greaterRoles;
	}

	public static List<Role> getRolesBelow(Role role, boolean eq) {
		List<Role> lesserRoles = new ArrayList<Role>();
		for (Role r : Role.values()) {
			if (r.ordinal() >= role.ordinal())
				if (eq)
					lesserRoles.add(r);
				else if (r.ordinal() > role.ordinal())
					lesserRoles.add(r);
		}
		return lesserRoles;
	}

	public static Role[] getInternalRoles() {
		return new Role[] { ROLE_SUPERUSER, ROLE_ADMIN, ROLE_MANAGER};
	}

	public static Role[] getExternalRoles() {
		return new Role[] { ROLE_USER, ROLE_UNPAYED_USER, ROLE_ANONYMOUS };
	}

	/* *********************************************************************************************
	 * Helper methods. Mostly for HQL.
	 * *********************************************************************************************
	 */

	public static String[] getInternalRolesAsString() {
		return new String[] { ROLE_SUPERUSER.toString(), ROLE_ADMIN.toString(), ROLE_MANAGER.toString()};
	}

}