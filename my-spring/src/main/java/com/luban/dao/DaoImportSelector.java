package com.luban.dao;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName IndexImport
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class DaoImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{IndexDaoBeanProcessor.class.getName()};
    }
}
