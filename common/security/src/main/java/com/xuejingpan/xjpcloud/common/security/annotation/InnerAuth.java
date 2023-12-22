package com.xuejingpan.xjpcloud.common.security.annotation;

import java.lang.annotation.*;

/**
 * @Annotation InnerAuth
 * @Description 微服务内部接口
 * @Author xuejingpan
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InnerAuth {

    boolean value() default true;
}
