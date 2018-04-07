package com.curiouser;

import java.util.Random;


public class RandomPassword {
    public static String genRandomNum(int pwd_len) {
// 35是因为数组是从0开始的，26个字母+10个数字
        final int maxNum = 67;
        int i; // 生成的随机数
        int count = 0; // 生成的密码的长度
        char[] str = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'
                ,'y','z','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P'
                ,'Q','R','S','T','U','V','W','X','Y','Z','@','%','#','&','$'};

        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < pwd_len) {
// 生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum)); // 生成的数最大为36-1
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    public static void main(String[] args) {
        System.out.println(genRandomNum(14));//生成14位随机密码
    }
}

