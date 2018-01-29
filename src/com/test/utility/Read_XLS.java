package com.test.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Read_XLS {
	public  String filelocation;//文件位置
    public  FileInputStream ipstr = null;//创建excel文件输入流
    public  FileOutputStream opstr =null;//创建excel文件输出流
    private HSSFWorkbook wb = null; //HSSFWorkbook 代表一个excel文件，创建对象并打开excel文件 
    private HSSFSheet ws = null;//HSSFSheet代表excel的第一张表格，从表格中循环读取数据
    HSSFRow row=null;//Row
    HSSFCell cell=null;//cell
    public Read_XLS(String filelocation) throws IOException{
    	this.filelocation=filelocation;
    	ipstr=new FileInputStream(filelocation);
    	wb=new HSSFWorkbook(ipstr);
    	ws=wb.getSheetAt(0);//从第一行读取,表格索引从0开始
    	ipstr.close();//关闭文件
    	
    	
    }
    //检索文件sheets的行数
    public int retrieveNoOfRows(String wsName){
    	int sheetIndex=wb.getSheetIndex(wsName);
    	if(sheetIndex==-1){
    		return 0;
    			
    		
    	}
    	else {
    		
    			
    			ws=wb.getSheetAt(sheetIndex);
    			int rowCount=ws.getLastRowNum()+1;
    			return rowCount;
    			
    		
		}
    	
    	
    	
    }
    
    //读取检索文件sheets行数
    public int retrieveNoOfCols(String wsName){
    	int sheetIndex=wb.getSheetIndex(wsName);
        if(sheetIndex==-1)
            return 0;
        else{
            ws = wb.getSheetAt(sheetIndex);
            int colCount=ws.getRow(0).getLastCellNum();         
            return colCount;
        }


    	
    	
    	
    }
  //读取测试套件和测试用例的SuiteToRun and CaseToRun标志
    


}
