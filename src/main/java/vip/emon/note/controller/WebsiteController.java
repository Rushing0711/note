/*
 * 文件名称：EmonController.java
 * 系统名称：一萌笔记
 * 模块名称：首页模块
 * 软件版权：Copyright (c) 2011-2018, liming20110711@163.com All Rights Reserved.
 * 功能说明：负责首页展示内容的生成
 * 开发人员：Rushing0711
 * 创建日期：20180317 09:29
 * 修改记录：
 * <Version>        <DateSerial>        <Author>        <Description>
 * 1.0.0            20180317-01         Rushing0711     M201803170929 新建文件
 ********************************************************************************/
package vip.emon.note.controller;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 负责首页展示内容的生成.
 *
 * <p>创建时间: <font style="color:#00FFFF">20180317 09:30</font><br>
 * [请在此输入功能详述]
 *
 * @author Rushing0711
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller
@RequestMapping("/website")
public class WebsiteController {

    public static final String REVISION_CONTROL = "Version:1.0.0,Date:20180317,Author:Rushing0711";

    @GetMapping("/introduction")
    public ModelAndView introduction(Map<String, Object> map) {
        DateTime beginDateTime = new DateTime(2018, 2, 27, 0, 0, 0);
        DateTime currentDateTime = new DateTime();

        String currentDate = currentDateTime.toString("yyyy年MM月dd日");
        int websiteRanDay = Days.daysBetween(beginDateTime, currentDateTime).getDays() + 1;

        map.put("currentDate", currentDate);
        map.put("websiteRanDay", websiteRanDay);

        return new ModelAndView("index", map);
    }
}
