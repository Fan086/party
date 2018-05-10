package com.hust.party.test.basetest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = { "classpath:application.xml","classpath:application-test.xml" })

@RunWith(SpringJUnit4ClassRunner.class) 
public abstract class springbaseTest extends AbstractJUnit4SpringContextTests{
	protected Logger logger = LoggerFactory.getLogger(getClass());
}
