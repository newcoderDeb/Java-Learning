package com.practice.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.practice.junit.tests.TestJUnit;
import com.practice.junit.tests.TestJUnit2;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestJUnit.class,
	TestJUnit2.class
})
public class TestSuite {
		

}
