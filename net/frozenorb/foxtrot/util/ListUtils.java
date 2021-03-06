package net.frozenorb.foxtrot.util;

import java.util.*;

public class ListUtils
{
    public static List<String> wrap(String string, final String color) {
        final String[] split = string.split(" ");
        string = "";
        final List<String> newString = new ArrayList<String>();
        for (int i = 0; i < split.length; ++i) {
            if (string.length() > 25 || string.endsWith(".") || string.endsWith("!") || string.endsWith("|")) {
                if (string.endsWith("|")) {
                    string = string.substring(0, string.length() - 1);
                }
                newString.add(color + string);
                if (string.endsWith(".") || string.endsWith("!")) {
                    newString.add("");
                }
                string = "";
            }
            string = string + ((string.length() == 0) ? "" : " ") + split[i];
        }
        newString.add(color + string);
        return newString;
    }
}
