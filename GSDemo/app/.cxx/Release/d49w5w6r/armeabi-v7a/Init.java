/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class Init extends State {
  private transient long swigCPtr;

  protected Init(long cPtr, boolean cMemoryOwn) {
    super(isoObject_wrapJNI.Init_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Init obj) {
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
        isoObject_wrapJNI.delete_Init(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ObjectStateID getStateID() {
    return ObjectStateID.swigToEnum(isoObject_wrapJNI.Init_getStateID(swigCPtr, this));
  }

  public void onExit(TestObject arg0) {
    isoObject_wrapJNI.Init_onExit(swigCPtr, this, TestObject.getCPtr(arg0), arg0);
  }

  public Init() {
    this(isoObject_wrapJNI.new_Init(), true);
  }

}
