package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // jpa 객체로 지정
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 컬럼명과 필드값 매핑
    @Column(name = "item_name", length = 20)
    private String itemName;
    // 필드값과 컬럼명이 같으면 생략 가능
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
