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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public void setTransactioncomplete_date(String transactioncomplete_date) {
        this.transactioncomplete_date = transactioncomplete_date;
    }

    public void setRecipt_count(int recipt_count) {
        this.recipt_count = recipt_count;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getId() {
        return id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getStatus() {
        return status;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public String getTransactioncomplete_date() {
        return transactioncomplete_date;
    }

    public int getRecipt_count() {
        return recipt_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
