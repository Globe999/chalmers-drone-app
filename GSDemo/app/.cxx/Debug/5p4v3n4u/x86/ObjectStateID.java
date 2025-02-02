/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public final class ObjectStateID {
  public final static ObjectStateID ISO_OBJECT_STATE_UNKNOWN = new ObjectStateID("ISO_OBJECT_STATE_UNKNOWN", isoObject_wrapJNI.ISO_OBJECT_STATE_UNKNOWN_get());
  public final static ObjectStateID ISO_OBJECT_STATE_OFF = new ObjectStateID("ISO_OBJECT_STATE_OFF", isoObject_wrapJNI.ISO_OBJECT_STATE_OFF_get());
  public final static ObjectStateID ISO_OBJECT_STATE_INIT = new ObjectStateID("ISO_OBJECT_STATE_INIT", isoObject_wrapJNI.ISO_OBJECT_STATE_INIT_get());
  public final static ObjectStateID ISO_OBJECT_STATE_ARMED = new ObjectStateID("ISO_OBJECT_STATE_ARMED", isoObject_wrapJNI.ISO_OBJECT_STATE_ARMED_get());
  public final static ObjectStateID ISO_OBJECT_STATE_DISARMED = new ObjectStateID("ISO_OBJECT_STATE_DISARMED", isoObject_wrapJNI.ISO_OBJECT_STATE_DISARMED_get());
  public final static ObjectStateID ISO_OBJECT_STATE_RUNNING = new ObjectStateID("ISO_OBJECT_STATE_RUNNING", isoObject_wrapJNI.ISO_OBJECT_STATE_RUNNING_get());
  public final static ObjectStateID ISO_OBJECT_STATE_POSTRUN = new ObjectStateID("ISO_OBJECT_STATE_POSTRUN", isoObject_wrapJNI.ISO_OBJECT_STATE_POSTRUN_get());
  public final static ObjectStateID ISO_OBJECT_STATE_REMOTE_CONTROLLED = new ObjectStateID("ISO_OBJECT_STATE_REMOTE_CONTROLLED", isoObject_wrapJNI.ISO_OBJECT_STATE_REMOTE_CONTROLLED_get());
  public final static ObjectStateID ISO_OBJECT_STATE_ABORTING = new ObjectStateID("ISO_OBJECT_STATE_ABORTING", isoObject_wrapJNI.ISO_OBJECT_STATE_ABORTING_get());
  public final static ObjectStateID ISO_OBJECT_STATE_PRE_ARMING = new ObjectStateID("ISO_OBJECT_STATE_PRE_ARMING", isoObject_wrapJNI.ISO_OBJECT_STATE_PRE_ARMING_get());
  public final static ObjectStateID ISO_OBJECT_STATE_PRE_RUNNING = new ObjectStateID("ISO_OBJECT_STATE_PRE_RUNNING", isoObject_wrapJNI.ISO_OBJECT_STATE_PRE_RUNNING_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ObjectStateID swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ObjectStateID.class + " with value " + swigValue);
  }

  private ObjectStateID(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ObjectStateID(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ObjectStateID(String swigName, ObjectStateID swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ObjectStateID[] swigValues = { ISO_OBJECT_STATE_UNKNOWN, ISO_OBJECT_STATE_OFF, ISO_OBJECT_STATE_INIT, ISO_OBJECT_STATE_ARMED, ISO_OBJECT_STATE_DISARMED, ISO_OBJECT_STATE_RUNNING, ISO_OBJECT_STATE_POSTRUN, ISO_OBJECT_STATE_REMOTE_CONTROLLED, ISO_OBJECT_STATE_ABORTING, ISO_OBJECT_STATE_PRE_ARMING, ISO_OBJECT_STATE_PRE_RUNNING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

