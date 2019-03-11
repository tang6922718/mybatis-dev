package cn.com.bonc.marketcloud.util;


import cn.com.bonc.marketcloud.entity.Result;

public class ResultUtil {

	public static Result success( Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result successTotal(Object object,long total) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setTotal(total);
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
