package com.example.dagger_android.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivitySingleton {

}
