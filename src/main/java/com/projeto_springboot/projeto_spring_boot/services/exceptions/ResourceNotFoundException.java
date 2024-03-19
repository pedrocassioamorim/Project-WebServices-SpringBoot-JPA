package com.projeto_springboot.projeto_spring_boot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;


    public ResourceNotFoundException(Object id){
        super("Resource Not Found! Id " + id);
    }


}
