package theater;

import java.time.LocalDateTime;

public class Invitation {
    private LocalDateTime when;
    private boolean used;

    public Invitation(LocalDateTime when) {
        this.when = when;
        this.used = false;
    }

    public boolean isUsed() {
        return used;
    }

    public void use() {
        used = true;
    }
}
