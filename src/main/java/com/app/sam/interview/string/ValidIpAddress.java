package com.app.sam.interview.string;


import java.util.ArrayList;

public class ValidIpAddress {
    public static void main(String[] args) {
        String str = "1921680";
        validIpAddress(str);
    }

    /**
     * 1921680
     * 192.168.0
     * 19.216.80
     *
     * @param str
     * @return
     */
    private static ArrayList<String> validIpAddress(String str) {
        int startIndex = 0;
        ArrayList<String> outpuList = new ArrayList<>();
        for (int i = 0; i < str.length() && i < 3; i++) {
            String ipAddress = "";
            String substring = str.substring(startIndex, i + 1);
            if (validSubIp(substring)) {
                ipAddress = ipAddress + substring;
                for (int j = i + 1; j < str.length() && j < i + 4; j++) {
                    String substring2 = str.substring(i + 1, j + 1);
                    if (validSubIp(substring2)) {
                        String ipAddress2 = ipAddress + "." + substring2;
                        for (int k = j + 1; k < str.length() && k < j + 4; k++) {
                            String substring3 = str.substring(j + 1, k + 1);
                            if (validSubIp(substring3)) {
                                String ipAddress3 = ipAddress2 + "." + substring3;
                                String substring4 = str.substring(k + 1, str.length());
                                if (validSubIp(substring4)) {
                                    String ipAddress4 = ipAddress3 + "." + substring4;
                                    outpuList.add(ipAddress4);
                                    System.out.println("Ip address :" + outpuList);
                                }
                            }
                        }
                    }

                }
            }
        }
        return outpuList;
    }

    private static boolean validSubIp(String s) {
        if (s.isEmpty()){
            return false;
        }
        int ip = Integer.parseInt(s);
        if (ip > 255 || ip < 0) {
            return false;
        } else if ((ip < 10 && s.length() > 1) || (ip < 100 && s.length() > 2)) {
            return false;
        } else if (s.length() > 3) {
            return false;
        }
        return true;
    }
}