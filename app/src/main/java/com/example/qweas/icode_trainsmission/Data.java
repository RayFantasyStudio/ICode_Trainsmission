package com.example.qweas.icode_trainsmission;

import cn.bmob.v3.BmobObject;

/**
 * Created by qweas on 2016/2/16 0016.
 */
public class Data extends BmobObject {



        //bmob数据表
        //不用管
        private String Title;
        private String Message;
        private String User;
        private String TitleMessage;
        private String imei;
        private Boolean jing;

        public Data() {
            this.setTableName("Data");
        }

        public String getTitle() {
            return Title;
        }

        public String getMessage() {
            return Message;
        }

        public String getTitleMessage() {
            return TitleMessage;
        }

        public String getUser() {
            return User;
        }

        public String getimei() {
            return imei;
        }

        public Boolean getjing() {
            return jing;
        }

        public void setMessage(String Message) {
            this.Message = Message;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public void setTitleMessage(String TitleMessage) {
            this.TitleMessage = TitleMessage;
        }

        public void setUser(String user) {
            this.User = user;
        }

        public void setimei(String imei) {
            this.imei = imei;
        }

        public void setjing(Boolean jing) {
            this.jing = jing;
        }


}
