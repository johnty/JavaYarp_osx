/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class TypedReaderImageRgbFloat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TypedReaderImageRgbFloat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypedReaderImageRgbFloat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_TypedReaderImageRgbFloat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStrict(boolean strict) {
    yarpJNI.TypedReaderImageRgbFloat_setStrict__SWIG_0(swigCPtr, this, strict);
  }

  public void setStrict() {
    yarpJNI.TypedReaderImageRgbFloat_setStrict__SWIG_1(swigCPtr, this);
  }

  public ImageRgbFloat read(boolean shouldWait) {
    long cPtr = yarpJNI.TypedReaderImageRgbFloat_read__SWIG_0(swigCPtr, this, shouldWait);
    return (cPtr == 0) ? null : new ImageRgbFloat(cPtr, false);
  }

  public ImageRgbFloat read() {
    long cPtr = yarpJNI.TypedReaderImageRgbFloat_read__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageRgbFloat(cPtr, false);
  }

  public void interrupt() {
    yarpJNI.TypedReaderImageRgbFloat_interrupt(swigCPtr, this);
  }

  public ImageRgbFloat lastRead() {
    long cPtr = yarpJNI.TypedReaderImageRgbFloat_lastRead(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageRgbFloat(cPtr, false);
  }

  public boolean isClosed() {
    return yarpJNI.TypedReaderImageRgbFloat_isClosed(swigCPtr, this);
  }

  public void useCallback(TypedReaderCallbackImageRgbFloat callback) {
    yarpJNI.TypedReaderImageRgbFloat_useCallback(swigCPtr, this, TypedReaderCallbackImageRgbFloat.getCPtr(callback), callback);
  }

  public void disableCallback() {
    yarpJNI.TypedReaderImageRgbFloat_disableCallback(swigCPtr, this);
  }

  public int getPendingReads() {
    return yarpJNI.TypedReaderImageRgbFloat_getPendingReads(swigCPtr, this);
  }

  public ConstString getName() {
    return new ConstString(yarpJNI.TypedReaderImageRgbFloat_getName(swigCPtr, this), true);
  }

  public void setReplier(PortReader reader) {
    yarpJNI.TypedReaderImageRgbFloat_setReplier(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public SWIGTYPE_p_void acquire() {
    long cPtr = yarpJNI.TypedReaderImageRgbFloat_acquire(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void release(SWIGTYPE_p_void handle) {
    yarpJNI.TypedReaderImageRgbFloat_release(swigCPtr, this, SWIGTYPE_p_void.getCPtr(handle));
  }

  public void setTargetPeriod(double period) {
    yarpJNI.TypedReaderImageRgbFloat_setTargetPeriod(swigCPtr, this, period);
  }

}
