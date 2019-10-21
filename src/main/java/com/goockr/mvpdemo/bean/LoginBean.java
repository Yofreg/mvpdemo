package com.goockr.mvpdemo.bean;

import java.util.List;

/**
 * @author yofreg
 * @time 2018/12/27 11:07
 * @desc
 */
public class LoginBean {

    private String code;
    private LoginIn2Bean data;
    private String message;
    private boolean status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LoginIn2Bean getData() {
        return data;
    }

    public void setData(LoginIn2Bean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public class LoginIn2Bean {

        private List<LoginIn3Bean> roleList; //权限列表
        private String token; //账号唯一token

        public List<LoginIn3Bean> getRoleList() {
            return roleList;
        }

        public void setRoleList(List<LoginIn3Bean> roleList) {
            this.roleList = roleList;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public class LoginIn3Bean {

            private String enname; //英文名称
            private String id; //权限id
            private String name; //权限名称
            private String roleType; //角色类型

            public String getEnname() {
                return enname;
            }

            public void setEnname(String enname) {
                this.enname = enname;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoleType() {
                return roleType;
            }

            public void setRoleType(String roleType) {
                this.roleType = roleType;
            }

            @Override
            public String toString() {
                return "LoginIn3Bean{" +
                        "enname='" + enname + '\'' +
                        ", id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", roleType='" + roleType + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "LoginIn2Bean{" +
                    "roleList=" + roleList +
                    ", token='" + token + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
