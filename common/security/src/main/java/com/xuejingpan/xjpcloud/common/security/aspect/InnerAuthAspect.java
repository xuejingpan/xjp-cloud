//package com.xuejingpan.xjpcloud.common.security.aspect;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.AnnotationUtils;
//
///**
// * @ClassName InnerAuthAspect
// * @Description TODO
// * @Author xuejingpan
// */
//@Aspect
//public class InnerAuthAspect implements Ordered {
//
//    private final HttpServletRequest request;
//
//    @Before("@within(inner) || @annotation(inner)")
//    public void around(JoinPoint point, Inner inner) {
//        // 实际注入的inner实体由表达式后一个注解决定，即是方法上的@Inner注解实体，若方法上无@Inner注解，则获取类上的
//        if (inner == null) {
//            Class<?> clazz = point.getTarget().getClass();
//            inner = AnnotationUtils.findAnnotation(clazz, Inner.class);
//        }
//        String header = request.getHeader(Headers.FROM);
//        if (inner.value() && !StrUtil.equals(SecurityConstants.FROM_IN, header)) {
//            log.warn("访问接口 {} 没有权限", point.getSignature().getName());
//            throw new AccessDeniedException("Access is denied");
//        }
//    }
//
//    /**
//     * 确保在权限认证AOP执行前执行
//     */
//    @Override
//    public int getOrder() {
//        return Ordered.HIGHEST_PRECEDENCE + 1;
//    }
//}
