package com.link.order;

public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException() {
        super(message);
        this.code = code;
    }


}
