package com.itheima.demo7_lombok的使用;

import lombok.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:56
 */
@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
public class Student {
    private String name;
    private int age;
    private String sex;

}
