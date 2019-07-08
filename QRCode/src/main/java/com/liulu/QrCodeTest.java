package com.liulu;

/**
 * @auther Liu_lu
 * @date 2019/7/8 20:40
 * @description:
 */
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        String text = "https://www.jianshu.com/p/cdf41ffb5b1c";
        // 嵌入二维码的图片路径
        String imgPath = "D:/temp/a.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:/temp/jam.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
     // String destPath="D:/temp/timg.jpg";
       // 解析二维码
      //  String str = QRCodeUtil.decode(destPath);
      //   System.out.println(str);
    }
}