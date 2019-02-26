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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-23T15:56:30.486Z")

@Controller
public class PersonsApiController implements PersonsApi {

    private static final Logger log = LoggerFactory.getLogger(PersonsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private Persons persons;

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
            if (pageSize != null && pageSize > 0 && pageSize <= 100) {
                return new ResponseEntity<>(getPersons(), HttpStatus.OK);
            } else if (pageSize < 100) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> personsPost(@ApiParam(value = "The person to create.") @Valid @RequestBody Person person) {
        String accept = request.getHeader("Accept");
        getPersons().addItemsItem(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> personsUsernameDelete(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        Person toRemove = null;
        if (getPersons().getItems() != null) {
            for (Person p : getPersons().getItems()) {
                if (p.getUsername().equals(username)) {
                    toRemove = p;
                    break;
                }
            }
            if (toRemove != null) {
                getPersons().getItems().remove(toRemove);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<Person> personsUsernameGet(@ApiParam(value = "The person's username", required = true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            for (Person p : getPersons().getItems()) {
                if (p.getUsername().equals(username)) {
                    return new ResponseEntity<>(p, HttpStatus.OK);
                }
            }

        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * @return the persons
     */
    public Persons getPersons() {
        if (persons == null) {
            persons = new Persons();
        }
        return persons;
    }

    @Override
    public ResponseEntity<Persons> personsUsernameFriendsGet(String username, Integer pageSize, Integer pageNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
