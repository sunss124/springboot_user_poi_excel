package com.fh.sunss.api.utils;

import com.fh.sunss.api.common.annotetion.ExportExcel;
import com.fh.sunss.api.entity.po.User;
import org.apache.http.HttpResponse;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PoiExcel {

/*    public static  void  exportExcel(HttpResponse response ,Class<?> objct,Integer sheetLength){
        //获取所有的属性数组
        Field[] fields = objct.getClass().getDeclaredFields();
        List<String> fieldNameList=new ArrayList<>();
        for (int i = 0; i <fields.length ; i++) {
            if(fields[i].isAnnotationPresent(ExportExcel.class)){
                System.out.println(fields[i].getName());
                fieldNameList.add(fields[i].getName());
            }

        }
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
        List<User> userList=userService.queryUserList(fieldNameList);
        XSSFWorkbook xwb = new XSSFWorkbook();
        XSSFSheet sheet = xwb.createSheet();
        //表头
        XSSFRow row=sheet.createRow(0) ;
        //将要导出的字段属性名设置为头标题
        String [] rowArr = new String[fields.length];
        for (int i = 0; i <fieldNameList.size() ; i++) {
            String name = fieldNameList.get(i);
            rowArr[i]=name;
            XSSFCell cell = row.createCell(i+1);
            cell.setCellValue(fieldNameList.get(i));
        }

        for (int i = 0; i < userList.size(); i++) {

            XSSFRow row1=sheet.createRow(i+1) ;


            //每个字段放入一个单元格
            XSSFCell cell = row1.createCell(0);

            cell.setCellValue(i);

            XSSFCell cell1 = row1.createCell(1);
            String username = userList.get(i).getName();
            cell1.setCellValue(username);

            XSSFCell cell2 = row1.createCell(2);
            String realName = userList.get(i).getAge().toString();
            cell2.setCellValue(realName);

            XSSFCell cell4 = row1.createCell(3);
            if (userList.get(i).getBirthday() != null) {
                String birthday = sim.format(userList.get(i).getBirthday());
                cell4.setCellValue(birthday);
            } else {
                cell4.setCellValue("");
            }

        }
        // CellRangeAddress region = new CellRangeAddress(1, 1, 0, 11);
        //sheet.addMergedRegion(region);
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/octet-stream");

        //String  name="type.xlsx";
        response.addHeader("Content-Disposition", "attachment; filename=\"" + UUID.randomUUID().toString() + "\".xlsx");
        ServletOutputStream outputStream = response.getOutputStream();
        xwb.write(outputStream);
        outputStream.close();
    }catch (Exception e){
        e.printStackTrace();
    }
    }*/
}
