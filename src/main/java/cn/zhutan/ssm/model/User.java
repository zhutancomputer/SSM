package cn.zhutan.ssm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private String id;
    private String username;
    private String password;
}
