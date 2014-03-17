package com.github.niugraph.model;

public class IdentifiedEdge<ID, DataT> extends DefaultEdge {

    protected ID id;
    protected DataT data;
    
    public ID getId(){
        return id;
    }
    
    public DataT getData(){
        return data;
    }
    
    public void setData(DataT value){
        data = value;
    }
    
    
}
