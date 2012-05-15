package com.martine.user

class Role {

	String authority

	Date dateCreated

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}

}
