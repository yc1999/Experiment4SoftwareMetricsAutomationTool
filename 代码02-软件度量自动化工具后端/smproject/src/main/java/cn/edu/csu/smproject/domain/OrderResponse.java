package cn.edu.csu.smproject.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;

public class OrderResponse {

    public String orderId;

    public String sysId;

    public String errorCode;

    public String msg;

    public OrderResponse() {
    }

    public OrderResponse(String orderId, String sysId, String errorCode, String msg) {
        this.orderId = orderId;
        this.sysId = sysId;
        this.errorCode = errorCode;
        this.msg = msg;
    }

    @JacksonXmlProperty(localName = "orderid")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JacksonXmlProperty(localName = "sysid")
    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    @JacksonXmlProperty(localName = "errorcode")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JacksonXmlProperty(localName = "msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
