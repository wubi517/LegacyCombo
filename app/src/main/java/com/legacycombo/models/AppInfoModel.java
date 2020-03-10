package com.legacycombo.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AppInfoModel implements Serializable {
        @SerializedName("imageUrl")
        private String imageurl="";
        @SerializedName("body")
        private String body="";
        @SerializedName("header")
        private String header="";

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }
}
