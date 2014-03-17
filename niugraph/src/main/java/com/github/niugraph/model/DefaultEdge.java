package com.github.niugraph.model;

public abstract class DefaultEdge implements Edge<DefaultVertex> {

    DefaultVertex source;
    DefaultVertex target;
    
    public DefaultVertex getSource() {
        return source;
    }

    public DefaultVertex getTarget() {
        return target;
    }

    protected void setSource(DefaultVertex source) {
        this.source = source;
    }

    protected void setTarget(DefaultVertex target) {
        this.target = target;
    }

}
