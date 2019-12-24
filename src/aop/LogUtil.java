package aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogUtil {
    void print(){
        System.out.println("-----before-----");
    }
}
