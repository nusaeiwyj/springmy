package com.nusaeiwyj.springmy.generator;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * article
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article implements Serializable {
    private Integer id;

    private String author;

    private String title;

    private String content;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}