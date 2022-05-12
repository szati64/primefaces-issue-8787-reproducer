package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class CaseOneController implements Serializable {

    private BigDecimal input1;
    private LocalDateTime lastUpdate;

    public void input1Changed() {
        lastUpdate = LocalDateTime.now();
    }

    public BigDecimal getInput1() {
        return input1;
    }

    public void setInput1(BigDecimal input1) {
        this.input1 = input1;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
