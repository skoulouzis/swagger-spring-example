package nl.uva.sne.controller;

import nl.uva.sne.model.Person;
import nl.uva.sne.model.Persons;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-23T15:56:30.486Z")

@Controller
public class PersonsApiController implements PersonsApi {

    private static final Logger log = LoggerFactory.getLogger(PersonsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PersonsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public ResponseEntity<Persons> personsGet(
            @Min(0) @Max(100) @ApiParam(value = "Number of persons returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
            @ApiParam(value = "Page number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            List<Person> items = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                Person person = new Person();
                person.setDateOfBirth(LocalDate.parse("2000-01-23"));
                person.setFirstName("firstName");
                person.setLastName("lastName");
                person.setUsername("username");
                person.setLastTimeOnline(OffsetDateTime.parse("2000-01-23T04:56:07.000+00:00"));
                if (pageSize != null && pageSize > 0 && pageSize <= 100 && items.size() < pageSize) {
                    items.add(person);
                } else {
                    break;
                }
            }
            Persons persons = new Persons();
            persons.setItems(items);
            if (pageSize != null && pageSize > 0 && pageSize <= 100) {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            } else if (pageSize < 100) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
//                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> personsPost(@ApiParam(value = "The person to create.") @Valid @RequestBody Person person) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> personsUsernameDelete(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Persons> personsUsernameFriendsGet(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username, @Min(0) @Max(100) @ApiParam(value = "Number of persons returned") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Page number") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"items\" : [ {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  }, {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",    \"dateOfBirth\" : \"2000-01-23\",    \"username\" : \"username\"  } ]}", Persons.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Person> personsUsernameGet(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"lastTimeOnline\" : \"2000-01-23T04:56:07.000+00:00\",  \"dateOfBirth\" : \"2000-01-23\",  \"username\" : \"username\"}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
