/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class Transition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Transition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Transition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        isoObject_wrapJNI.delete_Transition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSource(ObjectStateID value) {
    isoObject_wrapJNI.Transition_source_set(swigCPtr, this, value.swigValue());
  }

  public ObjectStateID getSource() {
    return ObjectStateID.swigToEnum(isoObject_wrapJNI.Transition_source_get(swigCPtr, this));
  }

  public void setEvent(EventType value) {
    isoObject_wrapJNI.Transition_event_set(swigCPtr, this, value.swigValue());
  }

  public EventType getEvent() {
    return EventType.swigToEnum(isoObject_wrapJNI.Transition_event_get(swigCPtr, this));
  }

  public void setTarget(ObjectStateID value) {
    isoObject_wrapJNI.Transition_target_set(swigCPtr, this, value.swigValue());
  }

  public ObjectStateID getTarget() {
    return ObjectStateID.swigToEnum(isoObject_wrapJNI.Transition_target_get(swigCPtr, this));
  }

  public Transition() {
    this(isoObject_wrapJNI.new_Transition(), true);
  }

}
