package com.github.pengpan.entity;

import com.github.pengpan.enums.BrushChannelEnum;
import com.github.pengpan.enums.OcrPlatformEnum;
import com.github.pengpan.enums.ProxyModeEnum;
import lombok.Data;

import java.util.List;

/**
 * @author pengpan
 */
@Data
public class Config {

    /**
     * 91160账号
     */
    private String userName;

    /**
     * 91160密码
     */
    private String password;

    /**
     * 城市编号
     */
    private String cityId;

    /**
     * 医院编号
     */
    private String unitId;

    /**
     * 科室编号
     */
    private String deptId;

    /**
     * 医生编号[可多选，如(1001,1002)]
     */
    private List<String> doctorId;

    /**
     * 需要周几的号[可多选，如(6,7)]
     */
    private List<String> weeks;

    /**
     * 时间段编号[可多选，如(am,pm)]
     */
    private List<String> days;

    /**
     * 时间点编号[可多选，如(08:00-08:30,10:00-10:30)]
     */
    private List<String> hours;

    /**
     * Server酱(https://sct.ftqq.com)的SendKey
     */
    private String sendKey;

    /**
     * 就诊人编号
     */
    private String memberId;

    /**
     * 刷号休眠时间[单位:毫秒]
     */
    private int sleepTime;

    /**
     * 刷号起始日期(表示刷该日期后一周的号,为空取当前日期)[格式: 2022-06-01]
     */
    private String brushStartDate;

    /**
     * 是否开启定时挂号[true/false]
     */
    private boolean enableAppoint;

    /**
     * 定时挂号时间[格式: 2022-06-01 15:00:00]
     */
    private String appointTime;

    /**
     * 是否开启代理[true/false]
     */
    private boolean enableProxy;

    /**
     * 代理文件路径[格式: /dir/proxy.txt]
     */
    private String proxyFilePath;

    /**
     * 获取代理方式[ROUND_ROBIN(轮询)/RANDOM(随机)]
     */
    private ProxyModeEnum proxyMode;

    /**
     * 刷号通道[CHANNEL_1(通道1)/CHANNEL_2(通道2)]
     */
    private BrushChannelEnum brushChannel;

    /**
     * 就诊卡号
     */
    private String medicalCard;

    /**
     * 斐斐打码PD账号
     */
    private String pdId;

    /**
     * 斐斐打码PD秘钥
     */
    private String pdKey;

    /**
     * 打码平台
     */
    private OcrPlatformEnum ocrPlatform;

    /**
     * 91160-ocr-server的服务地址
     */
    private String baseUrl;
}
