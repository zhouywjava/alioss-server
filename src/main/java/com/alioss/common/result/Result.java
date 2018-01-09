package com.alioss.common.result;

import java.io.Serializable;

/**
 * @Description: 返回对象接口
 * @Author: zyw
 * @Date: 2018/1/9
 */
public interface Result<T> extends Serializable {
    int getCode();

    T getContent();

    String getMessage();
}
