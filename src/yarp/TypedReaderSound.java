/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class TypedReaderSound {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TypedReaderSound(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypedReaderSound obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_TypedReaderSound(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStrict(boolean strict) {
    yarpJNI.TypedReaderSound_setStrict__SWIG_0(swigCPtr, this, strict);
  }

  public void setStrict() {
    yarpJNI.TypedReaderSound_setStrict__SWIG_1(swigCPtr, this);
  }

  public Sound read(boolean shouldWait) {
    long cPtr = yarpJNI.TypedReaderSound_read__SWIG_0(swigCPtr, this, shouldWait);
    return (cPtr == 0) ? null : new Sound(cPtr, false);
  }

  public Sound read() {
    long cPtr = yarpJNI.TypedReaderSound_read__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new Sound(cPtr, false);
  }

  public void interrupt() {
    yarpJNI.TypedReaderSound_interrupt(swigCPtr, this);
  }

  public Sound lastRead() {
    long cPtr = yarpJNI.TypedReaderSound_lastRead(swigCPtr, this);
    return (cPtr == 0) ? null : new Sound(cPtr, false);
  }

  public boolean isClosed() {
    return yarpJNI.TypedReaderSound_isClosed(swigCPtr, this);
  }

  public void useCallback(SWIGTYPE_p_yarp__os__TypedReaderCallbackT_yarp__sig__Sound_t callback) {
    yarpJNI.TypedReaderSound_useCallback(swigCPtr, this, SWIGTYPE_p_yarp__os__TypedReaderCallbackT_yarp__sig__Sound_t.getCPtr(callback));
  }

  public void disableCallback() {
    yarpJNI.TypedReaderSound_disableCallback(swigCPtr, this);
  }

  public int getPendingReads() {
    return yarpJNI.TypedReaderSound_getPendingReads(swigCPtr, this);
  }

  public ConstString getName() {
    return new ConstString(yarpJNI.TypedReaderSound_getName(swigCPtr, this), true);
  }

  public void setReplier(PortReader reader) {
    yarpJNI.TypedReaderSound_setReplier(swigCPtr, this, PortReader.getCPtr(reader), reader);
  }

  public SWIGTYPE_p_void acquire() {
    long cPtr = yarpJNI.TypedReaderSound_acquire(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void release(SWIGTYPE_p_void handle) {
    yarpJNI.TypedReaderSound_release(swigCPtr, this, SWIGTYPE_p_void.getCPtr(handle));
  }

  public void setTargetPeriod(double period) {
    yarpJNI.TypedReaderSound_setTargetPeriod(swigCPtr, this, period);
  }

}
