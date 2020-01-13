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

    public static  void  exportExcel(HttpResponse response ,Class<?> objct,List<?> list,Object object) {
    }
}
