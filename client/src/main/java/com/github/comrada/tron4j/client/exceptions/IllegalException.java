package com.github.comrada.tron4j.client.exceptions;

public class IllegalException extends  Exception {
    public IllegalException(){
        super("Query failed. Please check the parameters.");
    }

    public IllegalException(String message){
        super(message);
    }
}
