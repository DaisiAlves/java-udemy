package model.exceptions;

public class DomainException extends RuntimeException { //É uma classe que o compilador nao obriga a tratar, se for somente Exception ele obrigada. 
    private static final long serialVersionUID = 1L; 

    public DomainException(String msg) {
        super(msg); 

    }
}
