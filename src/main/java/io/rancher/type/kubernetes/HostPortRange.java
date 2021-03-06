package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;

public class HostPortRange extends AbstractType {
    
    private Integer max;
    
    private Integer min;
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
}
