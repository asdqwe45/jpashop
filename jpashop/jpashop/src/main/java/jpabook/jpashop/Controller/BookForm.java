package jpabook.jpashop.Controller;

import lombok.Getter;
import lombok.Setter;

import javax.websocket.server.ServerEndpoint;

@Getter @Setter
public class BookForm {

    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;

}

