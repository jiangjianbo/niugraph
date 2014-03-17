package com.github.niugraph.model;

/**
 * Edge of {@link Graph}
 * @author jjb
 *
 * @param <V> {@link Vertex} type
 */
public interface Edge<V> {

    /**
     * source {@link Vertex} of edge
     * @return
     */
    V getSource();

    /**
     * target {@link Vertex} of edge
     * @return
     */
    V getTarget();
    
}
