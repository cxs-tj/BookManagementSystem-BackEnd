package com.yangsan.bookmanagement.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Entry")
public class Entry implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;

    private String barcode;

    private String title;

    private String type;

    private String edition;

    private String author;

    private String press;

    private String location;

    private Integer price;

    private Integer inmum;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dateTime;

    private String total;

    private String handle;

    private String ticketNum;

    private String operator;
}
