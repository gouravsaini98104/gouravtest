package com.ikano.lending.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Authenticate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-12T07:52:23.868Z")

public class Authenticate {
	@JsonProperty("userName")
	private String userName = null;

	@JsonProperty("password")
	private String password = null;

	public Authenticate userName(String userName) {
		this.userName = userName;
		return this;
	}

	/**
	 * Get userName
	 * 
	 * @return userName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Authenticate password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * 
	 * @return password
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Authenticate authenticate = (Authenticate) o;
		return Objects.equals(this.userName, authenticate.userName)
				&& Objects.equals(this.password, authenticate.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Authenticate {\n");

		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
