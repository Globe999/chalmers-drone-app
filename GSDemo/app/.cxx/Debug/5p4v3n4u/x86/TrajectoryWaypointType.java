/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class TrajectoryWaypointType {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TrajectoryWaypointType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TrajectoryWaypointType obj) {
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
        isoObject_wrapJNI.delete_TrajectoryWaypointType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRelativeTime(timeval value) {
    isoObject_wrapJNI.TrajectoryWaypointType_relativeTime_set(swigCPtr, this, timeval.getCPtr(value), value);
  }

  public timeval getRelativeTime() {
    long cPtr = isoObject_wrapJNI.TrajectoryWaypointType_relativeTime_get(swigCPtr, this);
    return (cPtr == 0) ? null : new timeval(cPtr, false);
  }

  public void setPos(SWIGTYPE_p_CartesianPosition value) {
    isoObject_wrapJNI.TrajectoryWaypointType_pos_set(swigCPtr, this, SWIGTYPE_p_CartesianPosition.getCPtr(value));
  }

  public SWIGTYPE_p_CartesianPosition getPos() {
    return new SWIGTYPE_p_CartesianPosition(isoObject_wrapJNI.TrajectoryWaypointType_pos_get(swigCPtr, this), true);
  }

  public void setSpd(SWIGTYPE_p_SpeedType value) {
    isoObject_wrapJNI.TrajectoryWaypointType_spd_set(swigCPtr, this, SWIGTYPE_p_SpeedType.getCPtr(value));
  }

  public SWIGTYPE_p_SpeedType getSpd() {
    return new SWIGTYPE_p_SpeedType(isoObject_wrapJNI.TrajectoryWaypointType_spd_get(swigCPtr, this), true);
  }

  public void setAcc(SWIGTYPE_p_AccelerationType value) {
    isoObject_wrapJNI.TrajectoryWaypointType_acc_set(swigCPtr, this, SWIGTYPE_p_AccelerationType.getCPtr(value));
  }

  public SWIGTYPE_p_AccelerationType getAcc() {
    return new SWIGTYPE_p_AccelerationType(isoObject_wrapJNI.TrajectoryWaypointType_acc_get(swigCPtr, this), true);
  }

  public void setCurvature(SWIGTYPE_p_float_t value) {
    isoObject_wrapJNI.TrajectoryWaypointType_curvature_set(swigCPtr, this, SWIGTYPE_p_float_t.getCPtr(value));
  }

  public SWIGTYPE_p_float_t getCurvature() {
    return new SWIGTYPE_p_float_t(isoObject_wrapJNI.TrajectoryWaypointType_curvature_get(swigCPtr, this), true);
  }

  public TrajectoryWaypointType() {
    this(isoObject_wrapJNI.new_TrajectoryWaypointType(), true);
  }

}
