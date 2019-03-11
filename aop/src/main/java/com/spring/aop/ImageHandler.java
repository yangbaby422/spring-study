package com.spring.aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);
    //切点函数必须为空
    @Pointcut("execution(* com.spring.aop.ImageCopy.copyImage())")
    public  void  handleImage(){
    }
    @Before(value = "handleImage()")
    public  void pressTextOnImage()throws IOException{
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/me.jpg");
        //        创建一个BufferedImage
        BufferedImage srcImg= ImageIO.read(new FileInputStream(srcFile));
        int width =srcImg.getWidth();
        int height=srcImg.getHeight();
        File destFile = new File("D:/me1.jpg");
        Color color = new Color(211,71,38);
        int size = 30;
        Font font = new Font("微软雅黑",Font.BOLD,size);
        String text = "@洋酱";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width-text.length() * size)/2,height/2-size,1.0f);
         }
         @AfterReturning("handleImage()")
        public void grayImage(){
            logger.info("开始将图片转成黑白");
            File srcFile = new File("E:/me1.jpg");
            File destFile = new File("E:/me2.jpg");
            ImageUtil.gray(srcFile,destFile);
    }

}
