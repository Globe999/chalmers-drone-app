/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public final class EventType {
  public final static EventType D = new EventType("D");
  public final static EventType L = new EventType("L");
  public final static EventType B = new EventType("B");
  public final static EventType H = new EventType("H");
  public final static EventType M = new EventType("M");
  public final static EventType N = new EventType("N");
  public final static EventType S = new EventType("S");
  public final static EventType T = new EventType("T");
  public final static EventType U = new EventType("U");
  public final static EventType Y = new EventType("Y");
  public final static EventType R = new EventType("R");
  public final static EventType W = new EventType("W");
  public final static EventType E = new EventType("E");
  public final static EventType F = new EventType("F");
  public final static EventType X = new EventType("X");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static EventType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EventType.class + " with value " + swigValue);
  }

  private EventType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EventType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EventType(String swigName, EventType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EventType[] swigValues = { D, L, B, H, M, N, S, T, U, Y, R, W, E, F, X };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
