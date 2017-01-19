package com.rest.controller.customException;

import org.jetbrains.annotations.NonNls;

/**
 * @Author bruce.ge
 * @Date 2017/1/20
 * @Description
 */
public class TransactionException extends RuntimeException{
    public TransactionException() {
        super();
    }

    public TransactionException(@NonNls String message) {
        super(message);
    }
}
