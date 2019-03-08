package cn.kpy.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //获取输入信息
            String str = scanner.next().trim();
            System.out.println("输入str:" + str);
            /**是否为邮箱*/
            if (Validation_Mail(str)) {
                System.out.println("Email：" + str);
            }
            /**是否为手机号码*/
            else if (Validation_TelPhone(str)) {
                System.out.println("Tel：" + str);
            }
            /** 是否为网址*/
            else if(Validation_Url(str)){
                System.out.println("Url："+str);
            }
        }
    }

    /**
     * 邮箱验证
     **/
    public static Boolean Validation_Mail(String str) {
        if (!str.isEmpty()) {
            //设置邮箱验证规则
            String regex = "\\w+@(([a-zA-Z0-9])+\\.){1,3}[a-zA-Z0-9]+";
            flag = Regex(regex, str);
        }
        return flag;
    }


    /**
     * 手机号码验证
     **/
    public static Boolean Validation_TelPhone(String str) {
        if (!str.isEmpty()) {
            //设置手机号验证规则
            String regex = "^1[0-9]{10}";
            flag = Regex(regex, str);
        }
        return flag;
    }

    /**
     *  验证网址
     **/
    public static Boolean Validation_Url(String str){
        if(!str.isEmpty()){
            //设置URL验证规则
            //
            String regex = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?";
            flag = Regex(regex, str);
        }
        return flag;
    }

    /**
     * 统一验证入口
     **/
    public static Boolean Regex(String regex, String str) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        //System.out.println("pattern:" + pattern);
        Matcher matcher = pattern.matcher(str);
        flag = matcher.matches();
        //System.out.println("flag:" + flag);
        return flag;
    }
}
