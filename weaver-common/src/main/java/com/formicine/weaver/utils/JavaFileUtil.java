package com.formicine.weaver.utils;

/**
 * Created by zli on 2016/10/11.
 */
public class JavaFileUtil {
    /**
     * 当前方法名
     */
    public static String getMethodName() {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        return traceElement.getMethodName();
    }
}
