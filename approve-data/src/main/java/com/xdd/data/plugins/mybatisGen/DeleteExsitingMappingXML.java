package com.xdd.data.plugins.mybatisGen;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.io.File;
import java.util.List;

/**
 * Created by Deso on 2019/3/16.
 */
public class DeleteExsitingMappingXML extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
//        String sqlMapPath = sqlMap.getTargetProject() + File.separator
//                + sqlMap.getTargetPackage().replaceAll("\\.", File.separator)
//                + File.separator + sqlMap.getFileName();
//        File sqlMapFile = new File(sqlMapPath);
//        sqlMapFile.delete();
//        return true;

        sqlMap.setMergeable(false);
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }

}
