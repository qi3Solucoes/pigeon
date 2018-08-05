package br.com.qisi.pigeon.utils.base.utils;

public interface Command<T> {
  T execute(T t);
}
