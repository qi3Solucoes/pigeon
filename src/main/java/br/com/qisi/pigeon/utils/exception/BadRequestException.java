package br.com.qisi.pigeon.utils.exception;

public class BadRequestException extends RestException{

  public BadRequestException() {
    this("Request invalida!");
  }

  public BadRequestException(String message) {
    super(message);
  }
}
