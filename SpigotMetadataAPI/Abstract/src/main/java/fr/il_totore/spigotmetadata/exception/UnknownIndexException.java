package fr.il_totore.spigotmetadata.exception;

public class UnknownIndexException extends RuntimeException {

    public UnknownIndexException(int index){
        super(index + "");
    }
}
