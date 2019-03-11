package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class QrCodeTest {

    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
// 设置前景色，既二维码颜色（青色）
        Color foreColor = new Color(238,110,115);
        Color bgColor = new Color(252,228,236);
// 设置背景色（灰色）
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColor.getRGB());
        config.setBackColor(bgColor.getRGB());
        config.setImg("d:/me.jpg");
        QrCodeUtil.generate(
            "https://www.jianshu.com/u/7fc7b49e9c87", //二维码内容
                config,
               FileUtil.file("e:/qrcodeWithLogo.jpg")
                   //写出到的文件
       );

// 生成二维码到文件，也可以到流
 //      QrCodeUtil.generate("https://www.jianshu.com/u/7fc7b49e9c87", config,  QrConfig.create().setImg("d:/me.jpg") , FileUtil.file("d:/qrcode.jpg"));
//        // 生成指定url对应的二维码到文件，宽和高都是300像素
//        QrCodeUtil.generate("https://www.jianshu.com/u/7fc7b49e9c87", 300, 300, FileUtil.file("d:/qrcode.jpg"));
   }

}
