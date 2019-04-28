package com.xiangyuwenhua.school.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import java.util.Arrays;


@Aspect
@Order(-99)
@Component
public class EmptyAspect {

    private final String POINT_CUT = "execution(public * com.xiangyuwenhua.school.entity*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointCut() {
    }


    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Arrays.stream(args).forEach(arg -> {
            System.out.printf("arg-->" + arg + "\n");
        });
    }

}
