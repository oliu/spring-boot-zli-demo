package com.formicine.weaver.common.utils.resultHandler;

/**
 * Created by zli on 2016/11/23.
 */
public enum ResultEnum {
    SUCCESS(200, "请求处理成功"),
    PARAM_NULL(400, "参数[%p]为空"),
    PARAM_ILLEGAL(401, "参数格式[%p]不合法"),
    PARAMS_LACK(402, "参数不全"),
    PARAMS_INTERNAL_ERROR(403, "内部参数错误"),
    SOURCE_NOT_FOUND(404, "未找到"),
    METHOD_NOT_SUPPORTED(405, "方法不支持"),
    MEDIA_TYPE_NOT_SUPPORTED(415, "类型不支持"),
    INTERNAL_ERROR(500, "内部错误"),
    EXCEPTION(1000, "系统繁忙，稍后再试");

    private int code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage(String fieldName) {
        return this.getMessage(fieldName, "", "");
    }

    public String getMessage(String fieldName, String fieldValue) {
        return this.getMessage(fieldName, fieldValue, "=");
    }

    public String getMessage(String fieldName, String fieldValue, String split) {
        return this.message.replace("%p", fieldName.trim() + split + fieldValue);
    }

    public static String getMessageByCode(int code) {
        for (ResultEnum mode : ResultEnum.values()) {
            if (code == mode.code) {
                return mode.getMessage();
            }
        }
        throw new RuntimeException("unknown result code:" + code);
    }
}
