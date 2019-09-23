/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ikano.lending.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ikano.lending.model.RevolvingCreditDetails;
import com.ikano.lending.model.UpdateCustomerCreditDetails;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-13T04:00:48.789Z")

@Api(value = "customercreditdetails", description = "the customercreditdetails API")
public interface CustomercreditdetailsApi {

    @ApiOperation(value = "", nickname = "customercreditdetailsCustomerIdGet", notes = "Retrieves the revolving credit details.", response = RevolvingCreditDetails.class, tags={ "lending", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Lending page details.", response = RevolvingCreditDetails.class),
        @ApiResponse(code = 400, message = "Invalid data supplied.", response = Error.class),
        @ApiResponse(code = 404, message = "Data not found.", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = Error.class),
        @ApiResponse(code = 200, message = "Error.", response = Error.class) })
    @RequestMapping(value = "/customercreditdetails/{customerId}",
        method = RequestMethod.GET)
    ResponseEntity<RevolvingCreditDetails> customercreditdetailsCustomerIdGet(@ApiParam(value = "",required=true) @PathVariable("customerId") Long customerId);


    @ApiOperation(value = "", nickname = "customercreditdetailsPut", notes = "update customer credit details", tags={ "lending", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Customer Credit Details updated  successfully."),
        @ApiResponse(code = 400, message = "Invalid Request.", response = Error.class),
        @ApiResponse(code = 404, message = "Customer id does not exist.", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error. Could not process the request.", response = Error.class),
        @ApiResponse(code = 200, message = "Error", response = Error.class) })
    @RequestMapping(value = "/customercreditdetails",
        method = RequestMethod.PUT)
    ResponseEntity<Void> customercreditdetailsPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateCustomerCreditDetails updatecustomerCreditDetails);

}