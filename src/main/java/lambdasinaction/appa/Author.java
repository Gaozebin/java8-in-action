package lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author gaozebin
 * @date 2023/3/16 21:45
 */
@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
}
