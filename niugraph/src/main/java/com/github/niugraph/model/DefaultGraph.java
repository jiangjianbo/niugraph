package com.github.niugraph.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.github.niugraph.utils.Argument;

public abstract class DefaultGraph implements Graph<DefaultVertex, DefaultEdge> {

    protected List<DefaultVertex> allVertex = new ArrayList<DefaultVertex>();
    protected List<DefaultEdge> allEdges = new ArrayList<DefaultEdge>();
    protected VertexFactory<DefaultVertex> vertexFactory;
    protected EdgeFactory<DefaultVertex, DefaultEdge> edgeFactory;
    
    /**
     * constructor
     * @param vertexFactory
     * @param edgeFactory
     */
    protected DefaultGraph(VertexFactory<DefaultVertex> vertexFactory,
            EdgeFactory<DefaultVertex, DefaultEdge> edgeFactory) {
        this.vertexFactory = vertexFactory;
        this.edgeFactory = edgeFactory;
    }

    public Collection<DefaultVertex> getAllVertex() {
        return Collections.unmodifiableList(allVertex);
    }

    public Collection<DefaultEdge> getAllEdges() {
        return Collections.unmodifiableList(allEdges);
    }

    public boolean containsVertex(DefaultVertex vertex) {
        return allVertex.contains(vertex);
    }

    public boolean containsEdge(DefaultEdge edge) {
        return allEdges.contains(edge);
    }

    public boolean containsEdge(DefaultVertex source, DefaultVertex target) {
        return null != getEdge(source, target);
    }

    public DefaultEdge getEdge(DefaultVertex source, DefaultVertex target) {
        Argument.assertNotNull(source, "source");
        Argument.assertNotNull(target, "target");
        
        if( containsVertex(source) && containsVertex(target) ){
            for(DefaultEdge edge: source.getOutgoingEdges())
                if( target.equals(edge.getTarget()) )
                    return edge;
        }
        return null;
    }

    public VertexFactory<DefaultVertex> getVertexFactory() {
        return vertexFactory;
    }

    public EdgeFactory<DefaultVertex, DefaultEdge> getEdgeFactory() {
        return edgeFactory;
    }

    public DefaultVertex addVertex(DefaultVertex vertex) {
        int index = allVertex.indexOf(vertex);
        if( -1 == index ){
            allVertex.add(vertex);
            return vertex;
        }
        else
            return allVertex.get(index);
    }

    public DefaultEdge addEdge(DefaultVertex source, DefaultVertex target) {
        DefaultEdge edge = edgeFactory.createEdge(source, target);
        allEdges.add(edge);
        return edge;
    }

}
