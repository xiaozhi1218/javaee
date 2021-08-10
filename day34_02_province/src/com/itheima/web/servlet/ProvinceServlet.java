package com.itheima.web.servlet;

import com.itheima.pojo.Province;
import com.itheima.pojo.ResultBean;
import com.itheima.service.ProvinceService;
import com.itheima.utils.JsonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Leevi
 * 日期2020-10-26  15:56
 */
@WebServlet("/province")
public class ProvinceServlet extends BaseServlet {
    private ProvinceService provinceService = new ProvinceService();
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResultBean resultBean = new ResultBean(true);
        try {
            //调用业务层的方法查询所有省份信息
            List<Province> provinceList = provinceService.findAll();
            //将响应数据封装到ResultBean对象中
            resultBean.setData(provinceList);
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setFlag(false);
            resultBean.setErrorMsg("查询省份失败");
        }

        //将resultBean对象转换成json字符串输出到客户端
        JsonUtils.printResult(response,resultBean);
    }
}
