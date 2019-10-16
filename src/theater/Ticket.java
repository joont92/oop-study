package theater;

import java.time.LocalDateTime;

public class Ticket {
    private Integer fee;
    private LocalDateTime when;
    private boolean used;

    public Ticket(Integer fee, LocalDateTime when) {
        this.fee = fee;
        this.when = when;
        this.used = false;
    }

    public Integer getFee() {
        return fee;
    }

    public void use() {
        used = true;
    }
}
