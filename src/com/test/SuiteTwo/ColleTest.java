package com.test.SuiteTwo;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class ColleTest {
	@Test
	public void testset(){
		
		Set s1=new HashSet();
		Set s2=new HashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("d");
		s2.add("c");
		s2.add("e");
		
		Set Sn=new HashSet(s1);
		Sn.retainAll(s2);
		
		Set Su=new HashSet(s1);
		Su.addAll(s2);
		
		System.out.println(Sn);
		System.out.println(Su);
		
		
		
	}

}
