/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class DVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_DVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DVector() {
    this(yarpJNI.new_DVector__SWIG_0(), true);
  }

  public DVector(long n) {
    this(yarpJNI.new_DVector__SWIG_1(n), true);
  }

  public long size() {
    return yarpJNI.DVector_size(swigCPtr, this);
  }

  public long capacity() {
    return yarpJNI.DVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    yarpJNI.DVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return yarpJNI.DVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    yarpJNI.DVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    yarpJNI.DVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return yarpJNI.DVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    yarpJNI.DVector_set(swigCPtr, this, i, val);
  }

}