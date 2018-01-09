package com.sinoservices.doppler2.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Charlie
 *         To change this template use File | Settings | File Templates.
 */
public class OpBo implements Serializable{

    private String id;
    private Date timestamp;
    private String appName;
    private String host;
    private String opType;
    private String opObj;
    private String param;
    private String busParam;
    private String opRes;
    private long time;

    public OpBo(String id, Date timestamp, String appName, String host, String opType, String opObj, String param,String busParam,String result, long time){
        this.id = id;
        this.timestamp = timestamp;
        this.appName = appName;
        this.host = host;
        this.opType = opType;
        this.opObj = opObj;
        this.param = param;
        this.busParam = busParam;
        this.opRes = result;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOpObj() {
        return opObj;
    }

    public void setOpObj(String opObj) {
        this.opObj = opObj;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getBusParam() {
        return busParam;
    }

    public void setBusParam(String busParam) {
        this.busParam = busParam;
    }

    public String getOpRes() {
        return opRes;
    }

    public void setOpRes(String opRes) {
        this.opRes = opRes;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
