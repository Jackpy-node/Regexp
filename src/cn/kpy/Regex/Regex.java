package cn.kpy.Regex;

public class Regex {
    public static void main(String[] args) {
        /** 1、转义字符（\）*/
        String str1 = "./$";
        boolean flag1 = str1.matches("\\.\\/\\$");
        System.out.println("flag1:" + flag1);

        /** 2、边界字符（^、$）*/
        String str2 = "abc";
        boolean flag2 = str2.matches("^a\\w+c$");
        System.out.println("flag2:" + flag2);

        /** 3、匹配(以z开头，后续有0-n个o)的字符串（*）*/
        String str3 = "zoo";
        boolean flag3 = str3.matches("zo*");
        System.out.println("flag3:" + flag3);

        /** 4、（zo*）等价于（{0,}）*/
        String str4 = "zoo";
        boolean flag4 = str4.matches("zo{0,}");
        System.out.println("flag4:" + flag4);

        /** 5、匹配（以z开头，后续有1-n个o）的字符串（+）,可以匹配zo,但不匹配z*/
        String str5 = "zoo";
        boolean flag5 = str5.matches("zo+");
        System.out.println("flag5:" + flag5);

        /** 6、匹配（以z开头，后续有0-1个o）的字符串，可以匹配z、zo,但不匹配zoo*/
        String str6 = "zoo";
        boolean flag6 = str6.matches("zo?");
        System.out.println("flag6:" + flag6);

        /** 7、匹配确定的n次（{n}）*/
        String str7 = "ood";
        boolean flag7 = str7.matches("o{2}\\w");
        System.out.println("flag7:" + flag7);

        /** 8、匹配除“\r\n”之外的任何单个字符(.)*/
        String str8 = "%";
        boolean flag8 = str8.matches(".");
        System.out.println("flag8:" + flag8);

        /** 9、匹配（以x或y开头的字符串）（x|y）*/
        String str9 = "food";
        boolean flag9 = str9.matches("z|f");
        System.out.println("flag9:" + flag9);

        /** 10、字符集合，可以匹配包含的任意一个字符（[abc]）*/
        String str10 = "123b";
        boolean flag10 = str10.matches("123[abc]");
        System.out.println("flag10:" + flag10);

        /** 11、负值字符集合，可以匹配不包含任意一个字符（[abc]）*/
        String str11 = "123e";
        boolean flag11 = str11.matches("123[^abc]");
        System.out.println("flag11:" + flag11);

        /** 12、匹配指定范围内任意字符（[a-z]）*/
        String str12 = "asc";
        boolean flag12 = str12.matches("[a-z]*");
        System.out.println("flag12:" + flag12);

        /** 13、匹配非指定范围内任意字符（[^a-z]）*/
        String str13 = "123";
        boolean flag13 = str13.matches("[^a-z]*");
        System.out.println("flag13:" + flag13);

        /** 14、匹配单词的边界（er\b），可以匹配never中的er,但不可以匹配verb中的er*/
        String str14 = "never";
        boolean flag14 = str14.matches("\\w{3}er\\b");
        System.out.println("flag14:" + flag14);

        /** 15、匹配非单词的边界（er\B），不可以匹配never中的er,但可以匹配verb中的er*/
        String str15 = "verb";
        boolean flag15 = str15.matches(".?er\\B.?");
        System.out.println("flag15:" + flag15);

        /** 16、匹配数字字符（\d），等价于（[0-9]）*/
        String str16 = "123";
        boolean flag16 = str16.matches("\\d+");
        System.out.println("flag16:" + flag16);

        /** 17、匹配一个非数字字符（\D）,等价于（[^0-9]）*/
        String str17 = "abc";
        boolean flag17 = str17.matches("\\D+");
        System.out.println("flag17:" + flag17);

        /** 18、匹配不可见字符，空格、制表符、换页符（\s）*/
        String str18 = " ";
        boolean flag18 = str18.matches("\\s");
        System.out.println("flag18:" + flag18);

        /** 19、匹配不可见字符，除空格、制表符、换页符（\S）*/
        String str19 = " abc";
        boolean flag19 = str19.matches("\\s\\S+");
        System.out.println("flag19:" + flag19);

        /** 20、匹配包括下划线的任何字符（\w），类似但不等价于[A-Za-z0-9]*/
        String str20 = "abc_";
        boolean flag20 = str20.matches("\\w+");
        System.out.println("flag20：" + flag20);

        /** 21、匹配任何非单词字符（\W），等价于[^A-Za-z0-9_]*/
        String str21 = "*abc";
        boolean flag21 = str21.matches("\\W\\w+");
        System.out.println("flag21:" + flag21);

        /** 22、十六进制转义（\xn）,n为十六进制转义值，A的ASCII码即为41*/
        String str22 = "A";
        boolean flag22 = str22.matches("\\x41");
        System.out.println("flag22:" + flag22);

        /** 23、匹配num，查找与第num个"()"中的正则表达式相匹配的两个一样的值*/
        String str23 = "abcdabcd";
        boolean flag23 = str23.matches("(ab)(cd)\\1\\2");
        System.out.println("flag23:" + flag23);

        /** 24、分组（），如果要进行分组，就需要使用（）*/
        String str24 = "123qwe123qwe";
        boolean flag24 = str24.matches("(123qwe)+");
        System.out.println("flag24:" + flag24);

        /** 25、[]中的交集和并集*/
        String str25 = "abcdefgh1234567";
        boolean flag25 = str25.matches("[a-z0-9]+");  //并集
        System.out.println("flag25:" + flag25);

        boolean flag26 = str25.matches("[a-z0-9&&a-h1-6]"); //交集
        System.out.println("flag26:" + flag26);

    }
}
