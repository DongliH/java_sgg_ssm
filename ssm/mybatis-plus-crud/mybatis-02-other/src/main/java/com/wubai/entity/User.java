package com.wubai.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Value;

@TableName//可以不加，默认实体类的名字作为表名
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic
    //逻辑删除字段 int mybatis-plus下,默认 逻辑删除值为1 未逻辑删除 1
    private Integer deleted;
    @Version
    private Integer version;
}
