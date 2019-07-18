package com.xudaweb.springbootes.dto;

import java.io.Serializable;

/**
 * idcard
 *
 * @author xuda
 */
public class IdcardDTO implements Serializable {
    private String success;

    private Result result;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private String idcard;
        private String sex;
        private String att;

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAtt() {
            return att;
        }

        public void setAtt(String att) {
            this.att = att;
        }
    }

}
