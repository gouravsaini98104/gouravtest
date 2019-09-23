package com.ikano.lending.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateCustomerCreditDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-13T04:00:48.789Z")

public class UpdateCustomerCreditDetails   {
  @JsonProperty("customerId")
  private Long customerId = null;

  @JsonProperty("totalBalance")
  private Long totalBalance = null;

  public UpdateCustomerCreditDetails customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public UpdateCustomerCreditDetails totalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  /**
   * Get totalBalance
   * @return totalBalance
  **/
  @ApiModelProperty(value = "")


  public Long getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerCreditDetails updateCustomerCreditDetails = (UpdateCustomerCreditDetails) o;
    return Objects.equals(this.customerId, updateCustomerCreditDetails.customerId) &&
        Objects.equals(this.totalBalance, updateCustomerCreditDetails.totalBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, totalBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerCreditDetails {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
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

