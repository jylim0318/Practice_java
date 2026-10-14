package Data_load.DTO;

public class Power_usage {

    private String base_date;
    private String base_hour;
    private String hq_name;
    private String power_mwh;
    private String cust_cnt;

    public Power_usage(String base_date, String base_hour, String hq_name, String power_mwh, String cust_cnt) {
        this.base_date = base_date;
        this.base_hour = base_hour;
        this.hq_name = hq_name;
        this.power_mwh = power_mwh;
        this.cust_cnt = cust_cnt;
    }

    public String getBase_date() {
        return base_date;
    }

    public String getBase_hour() {
        return base_hour;
    }

    public String getHq_name() {
        return hq_name;
    }

    public String getPower_mwh() {
        return power_mwh;
    }

    public String getCust_cnt() {
        return cust_cnt;
    }
}
