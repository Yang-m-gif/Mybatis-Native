package com.sui.mybatis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.sui.Util.ServiceUtil;


public class GeneratorSqlMap {

	public void generator()throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp =new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback=new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		ServiceUtil.fillServiceClass(ResourceBundle.getBundle("mybatis").getString("project.service"));
	}
	
	public static void main(String[] args) {
		try {
			GeneratorSqlMap GeneratorSqlMap=new GeneratorSqlMap();

			GeneratorSqlMap.generator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
