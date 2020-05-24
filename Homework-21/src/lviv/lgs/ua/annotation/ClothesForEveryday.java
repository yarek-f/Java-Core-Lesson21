package lviv.lgs.ua.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClothesForEveryday {
	String value() default "nice choice";
}
