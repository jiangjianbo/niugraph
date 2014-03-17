package com.github.niugraph.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.github.niugraph.utils.Argument;

public abstract class DefaultVertex implements Vertex<DefaultEdge> {

    protected List<DefaultEdge> outgoingEdges = new ArrayList<DefaultEdge>();
    protected List<DefaultEdge> incomingEdges = new ArrayList<DefaultEdge>();
    
    public Collection<DefaultEdge> getOutgoingEdges() {
        return Collections.unmodifiableList(outgoingEdges);
    }

    public Collection<DefaultEdge> getIncomingEdges() {
        return Collections.unmodifiableList(incomingEdges);
    }

    public boolean containsEdge(DefaultEdge edge) {
        return containsOutgoingEdge(edge) || containsIncomingEdge(edge);
    }

    public boolean containsOutgoingEdge(DefaultEdge edge) {
        return outgoingEdges.contains(edge);
    }

    public boolean containsIncomingEdge(DefaultEdge edge) {
        return incomingEdges.contains(edge);
    }

    public boolean isConnect(Vertex<DefaultEdge> peerVertex) {
        return isConnectTo(peerVertex) || isConnectFrom(peerVertex);
    }

    public boolean isConnectTo(Vertex<DefaultEdge> target) {
        Argument.assertNotNull(target, "target");
        for(DefaultEdge edge : outgoingEdges)
            if( target.equals(edge) )
                return true;
        return false;
    }

    public boolean isConnectFrom(Vertex<DefaultEdge> source) {
        Argument.assertNotNull(source, "target");
        for(DefaultEdge edge : incomingEdges)
            if( source.equals(edge) )
                return true;
        return false;
    }

    
}
