/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class TrajectoryHeaderType {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TrajectoryHeaderType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TrajectoryHeaderType obj) {
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
        isoObject_wrapJNI.delete_TrajectoryHeaderType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTrajectoryID(int value) {
    isoObject_wrapJNI.TrajectoryHeaderType_trajectoryID_set(swigCPtr, this, value);
  }

  public int getTrajectoryID() {
    return isoObject_wrapJNI.TrajectoryHeaderType_trajectoryID_get(swigCPtr, this);
  }

  public void setTrajectoryName(String value) {
    isoObject_wrapJNI.TrajectoryHeaderType_trajectoryName_set(swigCPtr, this, value);
  }

  public String getTrajectoryName() {
    return isoObject_wrapJNI.TrajectoryHeaderType_trajectoryName_get(swigCPtr, this);
  }

  public void setTrajectoryInfo(TrajectoryInfoType value) {
    isoObject_wrapJNI.TrajectoryHeaderType_trajectoryInfo_set(swigCPtr, this, value.swigValue());
  }

  public TrajectoryInfoType getTrajectoryInfo() {
    return TrajectoryInfoType.swigToEnum(isoObject_wrapJNI.TrajectoryHeaderType_trajectoryInfo_get(swigCPtr, this));
  }

  public void setTrajectoryLength(long value) {
    isoObject_wrapJNI.TrajectoryHeaderType_trajectoryLength_set(swigCPtr, this, value);
  }

  public long getTrajectoryLength() {
    return isoObject_wrapJNI.TrajectoryHeaderType_trajectoryLength_get(swigCPtr, this);
  }

  public void setNWaypoints(long value) {
    isoObject_wrapJNI.TrajectoryHeaderType_nWaypoints_set(swigCPtr, this, value);
  }

  public long getNWaypoints() {
    return isoObject_wrapJNI.TrajectoryHeaderType_nWaypoints_get(swigCPtr, this);
  }

  public TrajectoryHeaderType() {
    this(isoObject_wrapJNI.new_TrajectoryHeaderType(), true);
  }

}