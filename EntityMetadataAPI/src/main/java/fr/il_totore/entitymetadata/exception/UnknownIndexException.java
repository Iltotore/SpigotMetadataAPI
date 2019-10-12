package fr.il_totore.entitymetadata.exception;

public class UnknownIndexException extends RuntimeException {

    public UnknownIndexException(int index){
        super(index + "");
    }
}
