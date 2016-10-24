package com.websystique.springmvc.controller;

import com.websystique.springmvc.persistence.entities.Organization;
import com.websystique.springmvc.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

    @Autowired
    private IOrganizationService organizationService;

    @RequestMapping(value = "/organization/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Organization>> getOrganizationById(@PathVariable("id") String id){
        List<Organization> organizations = organizationService.getOrganizationById(id);
        return new ResponseEntity<List<Organization>>(organizations, HttpStatus.OK);
    }
}
