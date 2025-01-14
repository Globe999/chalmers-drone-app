/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class UdpServer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UdpServer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UdpServer obj) {
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
        isoObject_wrapJNI.delete_UdpServer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UdpServer(long port) {
    this(isoObject_wrapJNI.new_UdpServer(port), true);
  }

  public void setBufferSize(long size) {
    isoObject_wrapJNI.UdpServer_setBufferSize(swigCPtr, this, size);
  }

  public void disconnect() {
    isoObject_wrapJNI.UdpServer_disconnect(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_char_t receive() {
    return new SWIGTYPE_p_std__vectorT_char_t(isoObject_wrapJNI.UdpServer_receive(swigCPtr, this), true);
  }

  public long send(SWIGTYPE_p_std__vectorT_char_t data, long nbytes) {
    return isoObject_wrapJNI.UdpServer_send(swigCPtr, this, SWIGTYPE_p_std__vectorT_char_t.getCPtr(data), nbytes);
  }

}
