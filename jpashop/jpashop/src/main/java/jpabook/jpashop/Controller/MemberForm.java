package jpabook.jpashop.Controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 있니다.")
    private  String name;

    private String city;
    private  String street;
    private String zipcode;
}
