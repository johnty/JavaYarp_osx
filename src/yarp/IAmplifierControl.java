/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class IAmplifierControl {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IAmplifierControl(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IAmplifierControl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_IAmplifierControl(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean enableAmp(int j) {
    return yarpJNI.IAmplifierControl_enableAmp(swigCPtr, this, j);
  }

  public boolean disableAmp(int j) {
    return yarpJNI.IAmplifierControl_disableAmp(swigCPtr, this, j);
  }

  public boolean getCurrents(SWIGTYPE_p_double vals) {
    return yarpJNI.IAmplifierControl_getCurrents__SWIG_0(swigCPtr, this, SWIGTYPE_p_double.getCPtr(vals));
  }

  public boolean getCurrent(int j, SWIGTYPE_p_double val) {
    return yarpJNI.IAmplifierControl_getCurrent__SWIG_0(swigCPtr, this, j, SWIGTYPE_p_double.getCPtr(val));
  }

  public boolean setMaxCurrent(int j, double v) {
    return yarpJNI.IAmplifierControl_setMaxCurrent(swigCPtr, this, j, v);
  }

  public boolean getAmpStatus(SWIGTYPE_p_int st) {
    return yarpJNI.IAmplifierControl_getAmpStatus__SWIG_0(swigCPtr, this, SWIGTYPE_p_int.getCPtr(st));
  }

  public boolean getAmpStatus(int j, SWIGTYPE_p_int v) {
    return yarpJNI.IAmplifierControl_getAmpStatus__SWIG_1(swigCPtr, this, j, SWIGTYPE_p_int.getCPtr(v));
  }

  public boolean getCurrents(DVector data) {
    return yarpJNI.IAmplifierControl_getCurrents__SWIG_1(swigCPtr, this, DVector.getCPtr(data), data);
  }

  public boolean getCurrent(int j, DVector data) {
    return yarpJNI.IAmplifierControl_getCurrent__SWIG_1(swigCPtr, this, j, DVector.getCPtr(data), data);
  }

}
