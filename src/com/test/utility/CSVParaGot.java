package com.test.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVParaGot {
	ReadAndWrCSV rw=new ReadAndWrCSV();
	AllAction ac=new AllAction();
	//获得csv文件中的文字信息,并将每行的信息分割成数组形式,将测试结果存储在List<String>中
	public List<String> FileString(String url) throws Exception{
		//获得csv中的元素信息
		List<String> gotfilelist=rw.ReadAnd(url);
		//所有的测试结果
		List<String> resultback=new ArrayList();
		//设置分割的字符串数组的长度
		String strline[]=new String[7];
		String ss=null; 
		String ll;
		/*
		for(int i=0;i<gotfilelist.size();i++){
			ss=gotfilelist.get(i);
			strline=ss.split(";");
			ll=ResultPara(strline);
			System.out.println("ll:"+ll);
			resultback.add(ll);
					
		}
		*/
		
		Iterator  ite=gotfilelist.iterator();
		while(ite.hasNext()){
			ss=(String) ite.next();
			strline=ss.split(";");
			//获得每行的测试结果
			ll=ResultPara(strline);
			
			resultback.add(ll);
			
			
			
		}
		
		
		return resultback;
		
		
		
	}
	
	
	//返回测试结果,参数以数组形式传递
	public String ResultPara(String arg[]) throws InterruptedException{
		 String listresult=null;
		 AllAction ac=new AllAction();
		 for(String i : arg){
			 
			 System.out.println(i+":arg["+i+"]");
		 }
		
		if(arg[2].equals("edit")){
		
			
			listresult=ac.editcontent(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5], arg[6]);
			
		}
       if(arg[2].equals("click")){
    	   
    	   //listresult=ac.clickaction(arg[0], arg[1], arg[2], arg[3], arg[4], arg[5]);
    	   listresult=ac.clickaction(arg);
    	     
			
			
		}
		
		return listresult;
		
		
		
	}

}
