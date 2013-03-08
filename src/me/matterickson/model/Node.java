/**
 * Copyright (c) 2013, Matthew Erickson (Matt@MattErickson.ME)
 * All rights reserved.
 * 
 * Please see copyright.txt for full license details
 **/
package me.matterickson.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matt@MattErickson.ME
 *
 */
public class Node {
  private int m_index;
  private String m_value;
  private List<Node> m_edgeNodes = new ArrayList<Node>();
  
  public Node() {
  }
  
  public Node(int index) {
    setIndex(index);
  }
  
  public Node(String value) {
    setValue(value);
  }
  
  public Node(List<Node> nodes) {
    m_edgeNodes.addAll(nodes);
  }
  
  public Node(String value, List<Node> nodes) {
    setValue(value);
    m_edgeNodes.addAll(nodes);
  }
  
  public void setEdges(List<Node> nodes) {
    m_edgeNodes.addAll(nodes);
  }
  
  public List<Node> getEdges() {
    return m_edgeNodes;
  }

  /**
   * @return the m_value
   */
  public String getValue() {
    return m_value;
  }

  /**
   * @param m_value the m_value to set
   */
  public void setValue(String m_value) {
    this.m_value = m_value;
  }
  
  @Override
  public String toString() {
    return m_value + " " + m_index;
  }

  /**
   * @return the m_index
   */
  public int getIndex() {
    return m_index;
  }

  /**
   * @param m_index the m_index to set
   */
  public void setIndex(int m_index) {
    this.m_index = m_index;
  }
}
