package com.jkkg.hhtx.net.bean;

import java.io.Serializable;
import java.util.List;

public class OtcWalletBean implements Serializable {


    /**
     * all_USDT : 432998.7343
     * list : [{"currency_name":"TRX","create_time":"2020-09-27 17:29:18","RMB":"0","currency_explain":"TRX","frozen":"0","USDT":"0","version":"1","usable":"100000","wallet_id":2,"update_time":"2020-09-27 17:29:18","user_id":27688,"currency_type":0,"wallet_type":1,"currency_id":1},{"currency_name":"USDT","create_time":"2020-09-29 16:07:10","RMB":"671703.1026735","currency_explain":"USDT","frozen":"0","USDT":"99733.2001","version":"1","usable":"99733.2001","wallet_id":124,"update_time":"2020-09-29 16:31:23","user_id":27688,"currency_type":0,"wallet_type":1,"currency_id":12},{"currency_name":"DC","create_time":"2020-09-29 16:07:15","RMB":"2244543.372837","currency_explain":"DC","frozen":"0","USDT":"333265.5342","version":"1","usable":"1000797.4","wallet_id":125,"update_time":"2020-09-29 16:31:23","user_id":27688,"currency_type":0,"wallet_type":1,"currency_id":13}]
     * all_RMB : 2916246.4755105
     */

    private String all_USDT;
    private String all_RMB;
    private List<ListBean> list;

    public String getAll_USDT() {
        return all_USDT;
    }

    public void setAll_USDT(String all_USDT) {
        this.all_USDT = all_USDT;
    }

    public String getAll_RMB() {
        return all_RMB;
    }

    public void setAll_RMB(String all_RMB) {
        this.all_RMB = all_RMB;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        /**
         * currency_name : TRX
         * create_time : 2020-09-27 17:29:18
         * RMB : 0
         * currency_explain : TRX
         * frozen : 0
         * USDT : 0
         * version : 1
         * usable : 100000
         * wallet_id : 2
         * update_time : 2020-09-27 17:29:18
         * user_id : 27688
         * currency_type : 0
         * wallet_type : 1
         * currency_id : 1
         */

        private String currency_name;
        private String create_time;
        private String RMB;
        private String currency_explain;
        private String frozen;
        private String USDT;
        private String version;
        private String usable;
        private int wallet_id;
        private String update_time;
        private int user_id;
        private int currency_type;
        private int wallet_type;
        private int currency_id;

        public String getCurrency_name() {
            return currency_name;
        }

        public void setCurrency_name(String currency_name) {
            this.currency_name = currency_name;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getRMB() {
            return RMB;
        }

        public void setRMB(String RMB) {
            this.RMB = RMB;
        }

        public String getCurrency_explain() {
            return currency_explain;
        }

        public void setCurrency_explain(String currency_explain) {
            this.currency_explain = currency_explain;
        }

        public String getFrozen() {
            return frozen;
        }

        public void setFrozen(String frozen) {
            this.frozen = frozen;
        }

        public String getUSDT() {
            return USDT;
        }

        public void setUSDT(String USDT) {
            this.USDT = USDT;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getUsable() {
            return usable;
        }

        public void setUsable(String usable) {
            this.usable = usable;
        }

        public int getWallet_id() {
            return wallet_id;
        }

        public void setWallet_id(int wallet_id) {
            this.wallet_id = wallet_id;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getCurrency_type() {
            return currency_type;
        }

        public void setCurrency_type(int currency_type) {
            this.currency_type = currency_type;
        }

        public int getWallet_type() {
            return wallet_type;
        }

        public void setWallet_type(int wallet_type) {
            this.wallet_type = wallet_type;
        }

        public int getCurrency_id() {
            return currency_id;
        }

        public void setCurrency_id(int currency_id) {
            this.currency_id = currency_id;
        }
    }
}
