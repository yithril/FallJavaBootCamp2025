package com.example.first_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

public class ResourceNotFoundException extends ErrorResponseException {

    public ResourceNotFoundException(String resourceName, Long id) {
        super(HttpStatus.NOT_FOUND, createDetail(resourceName, id), null);
    }

    private static ProblemDetail createDetail(String resourceName, Long id) {
        ProblemDetail detail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        detail.setTitle("Resource Not Found");
        detail.setDetail(resourceName + " with id " + id + " was not found");
        detail.setType(URI.create("https://example.com/errors/not-found"));
        return detail;
    }
}
