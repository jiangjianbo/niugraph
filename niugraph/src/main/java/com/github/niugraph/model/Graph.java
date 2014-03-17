package com.github.niugraph.model;

import java.util.Collection;

/**
 * Graph Model
 * @author jjb
 *
 * @param <V>
 * @param <E>
 */
public interface Graph<V, E> {

    /**
     * all {@link Vertex} of graph
     * @return vertex collection
     */
    Collection<V> getAllVertex();
    
    /**
     * all {@link Edge} of graph
     * @return edge collection
     */
    Collection<E> getAllEdges();
    
    /**
     * add vertex into graph
     * @param vertex
     * @return
     */
    V addVertex(V vertex);

    /**
     * connect source and target by edge 
     * @param source
     * @param target
     * @return
     */
    E addEdge(V source, V target);
    
    /**
     * check {@link Vertex} in graph
     * @param vertex
     * @return true for exist and false for not exist
     */
    boolean containsVertex(V vertex);
    
    /**
     * check {@link Edge} in graph
     * @param edge
     * @return true for exist and false for not exist
     */
    boolean containsEdge(E edge);
    
    /**
     * check {@link Edge} by source and target {@link Vertex} in graph
     * @param source
     * @param target
     * @return true for exist and false for not exist
     */    
    boolean containsEdge(V source, V target);
    
    /**
     * get {@link Edge} by source and target {@link Vertex} in graph
     * @param source
     * @param target
     * @return edge or null if not found
     */
    E getEdge(V source, V target);
    
    /**
     * {@link Vertex} factory used by graph
     * @return
     */
    VertexFactory<V> getVertexFactory();
    
    /**
     * {@link Edge} factory used by graph
     * @return
     */
    EdgeFactory<V, E> getEdgeFactory();
}
