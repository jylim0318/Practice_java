package FileDTO;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Power_usageDTO {

    private LocalDate base_date;
    private String base_hour;
    private String hq_name;
    private int power_mwh;
    private int cust_cnt;


}
