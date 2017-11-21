package hello;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "sales")
public class Sale {
    @Id
    private Integer id;

    private int team_id;
    private int user_id;
    private String status;
    private String transaction_date;
    private String transactioncomplete_date;
    private int recipt_count;
    private String created_at;
    private String updated_at;
}
