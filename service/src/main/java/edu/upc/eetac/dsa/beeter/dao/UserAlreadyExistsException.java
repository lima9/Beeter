package edu.upc.eetac.dsa.beeter.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAlreadyExistsException extends Exception {
}
