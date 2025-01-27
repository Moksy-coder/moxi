package com.moxi.apicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.moxi.apicommon.model.entity.Post;

/**
 * 帖子视图
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}