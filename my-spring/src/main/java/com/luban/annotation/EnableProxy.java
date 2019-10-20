package com.luban.annotation;


import com.luban.dao.DaoImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(DaoImportSelector.class)
public @interface EnableProxy {
}
