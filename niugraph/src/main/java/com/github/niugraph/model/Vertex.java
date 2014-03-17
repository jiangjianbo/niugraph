package com.github.niugraph.model;

import java.util.Collection;

/**
 * vertex of graph
 * @author jjb
 *
 * @param <E> {@link Edge} type of graph
 */
public interface Vertex<E> {

    /**
     * get all outgoing {@link Edge}s of vertex
     * @return
     */
    Collection<E> getOutgoingEdges();
    
    /**
     * get all incoming {@link Edge}s of vertex
     * @return
     */
    Collection<E> getIncomingEdges();
    
    /**
     * check edge contains in outgoing or incoming
     * @param edge
     * @return
     */
    boolean containsEdge(E edge);
    
    /**
     * check edge contains in outgoing
     * @param edge
     * @return
     */
    boolean containsOutgoingEdge(E edge);
    
    /**
     * check edge contains in incoming
     * @param edge
     * @return
     */
    boolean containsIncomingEdge(E edge);
    
    /**
     * check connection with vertex, ignore direction
     * @param peerVertex
     * @return true for connected and false for none
     */
    boolean isConnect(Vertex<E> peerVertex);
    
    /**
     * check direction from this vertex to target
     * @param target
     * @return true for linked to and false for none
     */
    boolean isConnectTo(Vertex<E> target);
    
    /**
     * check direction from source to this vertex 
     * @param source
     * @return true for linked from and false for none
     */
    boolean isConnectFrom(Vertex<E> source);
}
