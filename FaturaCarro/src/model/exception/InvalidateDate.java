package model.exception;

public class InvalidateDate extends Exception{
    public InvalidateDate(String message){
        super("A data de retorno nao pode ser menor que a entrega");
    }

}
