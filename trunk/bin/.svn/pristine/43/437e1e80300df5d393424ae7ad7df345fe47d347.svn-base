package com.hadoit.game.fsgame.gms.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {})
@Documented
public @interface ReportInfo {
	public String name();

	public String fileName() default "";

	public String sheetName() default "";

	public String[] headProps() default {};

	public String[] headNames() default {};
}
