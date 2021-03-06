/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class GazeEventParameters {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GazeEventParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GazeEventParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_GazeEventParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(ConstString value) {
    yarpJNI.GazeEventParameters_type_set(swigCPtr, this, ConstString.getCPtr(value), value);
  }

  public ConstString getType() {
    long cPtr = yarpJNI.GazeEventParameters_type_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstString(cPtr, false);
  }

  public void setMotionOngoingCheckPoint(double value) {
    yarpJNI.GazeEventParameters_motionOngoingCheckPoint_set(swigCPtr, this, value);
  }

  public double getMotionOngoingCheckPoint() {
    return yarpJNI.GazeEventParameters_motionOngoingCheckPoint_get(swigCPtr, this);
  }

  public GazeEventParameters() {
    this(yarpJNI.new_GazeEventParameters(), true);
  }

}
