package com.ikano.lending.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RevolvingCreditDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-13T04:00:48.789Z")

public class RevolvingCreditDetails {
	@JsonProperty("balance")
	private Integer balance = null;

	@JsonProperty("leftToSpend")
	private Integer leftToSpend = null;

	@JsonProperty("creditLimit")
	private Integer creditLimit = null;

	@JsonProperty("dueDate")
	private LocalDate dueDate = null;

	@JsonProperty("minimumAmountDue")
	private Integer minimumAmountDue = null;

	public RevolvingCreditDetails balance(Integer balance) {
		this.balance = balance;
		return this;
	}

	/**
	 * Get balance
	 * 
	 * @return balance
	 **/
	@ApiModelProperty(value = "")

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public RevolvingCreditDetails leftToSpend(Integer leftToSpend) {
		this.leftToSpend = leftToSpend;
		return this;
	}

	/**
	 * Get leftToSpend
	 * 
	 * @return leftToSpend
	 **/
	@ApiModelProperty(value = "")

	public Integer getLeftToSpend() {
		return leftToSpend;
	}

	public void setLeftToSpend(Integer leftToSpend) {
		this.leftToSpend = leftToSpend;
	}

	public RevolvingCreditDetails creditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
		return this;
	}

	/**
	 * Get creditLimit
	 * 
	 * @return creditLimit
	 **/
	@ApiModelProperty(value = "")

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}

	public RevolvingCreditDetails dueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	/**
	 * Get dueDate
	 * 
	 * @return dueDate
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public RevolvingCreditDetails minimumAmountDue(Integer minimumAmountDue) {
		this.minimumAmountDue = minimumAmountDue;
		return this;
	}

	/**
	 * Get minimumAmountDue
	 * 
	 * @return minimumAmountDue
	 **/
	@ApiModelProperty(value = "")

	public Integer getMinimumAmountDue() {
		return minimumAmountDue;
	}

	public void setMinimumAmountDue(Integer minimumAmountDue) {
		this.minimumAmountDue = minimumAmountDue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RevolvingCreditDetails revolvingCreditDetails = (RevolvingCreditDetails) o;
		return Objects.equals(this.balance, revolvingCreditDetails.balance)
				&& Objects.equals(this.leftToSpend, revolvingCreditDetails.leftToSpend)
				&& Objects.equals(this.creditLimit, revolvingCreditDetails.creditLimit)
				&& Objects.equals(this.dueDate, revolvingCreditDetails.dueDate)
				&& Objects.equals(this.minimumAmountDue, revolvingCreditDetails.minimumAmountDue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance, leftToSpend, creditLimit, dueDate, minimumAmountDue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RevolvingCreditDetails {\n");

		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    leftToSpend: ").append(toIndentedString(leftToSpend)).append("\n");
		sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    minimumAmountDue: ").append(toIndentedString(minimumAmountDue)).append("\n");
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
