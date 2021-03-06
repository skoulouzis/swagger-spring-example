/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package nl.uva.sne.controller;

import nl.uva.sne.model.Error;
import nl.uva.sne.model.Person;
import nl.uva.sne.model.Persons;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-23T15:56:30.486Z")

@Api(value = "persons", description = "the persons API")
public interface PersonsApi {

    @ApiOperation(value = "Gets some persons", nickname = "personsGet", notes = "Returns a list containing all persons. The list supports paging.", response = Persons.class, tags = {})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A list of Person", response = Persons.class)
        ,
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Error.class)})
    @RequestMapping(value = "/persons",
            method = RequestMethod.GET)
    ResponseEntity<Persons> personsGet(@Min(0) @Max(100) @ApiParam(value = "Number of persons returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Page number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber);

    @ApiOperation(value = "Creates a person", nickname = "personsPost", notes = "Adds a new person to the persons list.", tags = {})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Person succesfully created.")
        ,
        @ApiResponse(code = 400, message = "Person couldn't have been created.")
        ,
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Error.class)})
    @RequestMapping(value = "/persons",
            method = RequestMethod.POST)
    ResponseEntity<Void> personsPost(@ApiParam(value = "The person to create.") @Valid @RequestBody Person person);

    @ApiOperation(value = "Deletes a person", nickname = "personsUsernameDelete", notes = "Delete a single person identified via its username", tags = {})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Person successfully deleted.")
        ,
        @ApiResponse(code = 404, message = "Person does not exist.")
        ,
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Error.class)})
    @RequestMapping(value = "/persons/{username}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> personsUsernameDelete(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username);

    @ApiOperation(value = "Gets a person's friends", nickname = "personsUsernameFriendsGet", notes = "Returns a list containing all persons. The list supports paging.", response = Persons.class, tags = {})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A person's friends list", response = Persons.class)
        ,
        @ApiResponse(code = 404, message = "Person does not exist.")
        ,
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Error.class)})
    @RequestMapping(value = "/persons/{username}/friends",
            method = RequestMethod.GET)
    ResponseEntity<Persons> personsUsernameFriendsGet(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username, @Min(0) @Max(100) @ApiParam(value = "Number of persons returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Page number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber);

    @ApiOperation(value = "Gets a person", nickname = "personsUsernameGet", notes = "Returns a single person for its username.", response = Person.class, tags = {})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A Person", response = Person.class)
        ,
        @ApiResponse(code = 404, message = "Person does not exist.")
        ,
        @ApiResponse(code = 500, message = "An unexpected error occured.", response = Error.class)})
    @RequestMapping(value = "/persons/{username}",
            method = RequestMethod.GET)
    ResponseEntity<Person> personsUsernameGet(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username);

}
