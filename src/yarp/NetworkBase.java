/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class NetworkBase {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NetworkBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NetworkBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_NetworkBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void initMinimum() {
    yarpJNI.NetworkBase_initMinimum();
  }

  public static void finiMinimum() {
    yarpJNI.NetworkBase_finiMinimum();
  }

  public static boolean connect(String src, String dest, String carrier, boolean quiet) {
    return yarpJNI.NetworkBase_connect__SWIG_0(src, dest, carrier, quiet);
  }

  public static boolean connect(String src, String dest, String carrier) {
    return yarpJNI.NetworkBase_connect__SWIG_1(src, dest, carrier);
  }

  public static boolean connect(String src, String dest) {
    return yarpJNI.NetworkBase_connect__SWIG_2(src, dest);
  }

  public static boolean connect(String src, String dest, ContactStyle style) {
    return yarpJNI.NetworkBase_connect__SWIG_3(src, dest, ContactStyle.getCPtr(style), style);
  }

  public static boolean disconnect(String src, String dest, boolean quiet) {
    return yarpJNI.NetworkBase_disconnect__SWIG_0(src, dest, quiet);
  }

  public static boolean disconnect(String src, String dest) {
    return yarpJNI.NetworkBase_disconnect__SWIG_1(src, dest);
  }

  public static boolean disconnect(String src, String dest, ContactStyle style) {
    return yarpJNI.NetworkBase_disconnect__SWIG_2(src, dest, ContactStyle.getCPtr(style), style);
  }

  public static boolean isConnected(String src, String dest, boolean quiet) {
    return yarpJNI.NetworkBase_isConnected__SWIG_0(src, dest, quiet);
  }

  public static boolean isConnected(String src, String dest) {
    return yarpJNI.NetworkBase_isConnected__SWIG_1(src, dest);
  }

  public static boolean isConnected(String src, String dest, ContactStyle style) {
    return yarpJNI.NetworkBase_isConnected__SWIG_2(src, dest, ContactStyle.getCPtr(style), style);
  }

  public static boolean exists(String port, boolean quiet) {
    return yarpJNI.NetworkBase_exists__SWIG_0(port, quiet);
  }

  public static boolean exists(String port) {
    return yarpJNI.NetworkBase_exists__SWIG_1(port);
  }

  public static boolean exists(String port, ContactStyle style) {
    return yarpJNI.NetworkBase_exists__SWIG_2(port, ContactStyle.getCPtr(style), style);
  }

  public static boolean sync(String port, boolean quiet) {
    return yarpJNI.NetworkBase_sync__SWIG_0(port, quiet);
  }

  public static boolean sync(String port) {
    return yarpJNI.NetworkBase_sync__SWIG_1(port);
  }

  public static int main(int argc, SWIGTYPE_p_p_char argv) {
    return yarpJNI.NetworkBase_main(argc, SWIGTYPE_p_p_char.getCPtr(argv));
  }

  public static int runNameServer(int argc, SWIGTYPE_p_p_char argv) {
    return yarpJNI.NetworkBase_runNameServer(argc, SWIGTYPE_p_p_char.getCPtr(argv));
  }

  public static void assertion(boolean shouldBeTrue) {
    yarpJNI.NetworkBase_assertion(shouldBeTrue);
  }

  public static Contact queryName(String name) {
    return new Contact(yarpJNI.NetworkBase_queryName(name), true);
  }

  public static Contact registerName(String name) {
    return new Contact(yarpJNI.NetworkBase_registerName(name), true);
  }

  public static Contact registerContact(Contact contact) {
    return new Contact(yarpJNI.NetworkBase_registerContact(Contact.getCPtr(contact), contact), true);
  }

  public static Contact unregisterName(String name) {
    return new Contact(yarpJNI.NetworkBase_unregisterName(name), true);
  }

  public static Contact unregisterContact(Contact contact) {
    return new Contact(yarpJNI.NetworkBase_unregisterContact(Contact.getCPtr(contact), contact), true);
  }

  public static boolean setProperty(String name, String key, Value value) {
    return yarpJNI.NetworkBase_setProperty(name, key, Value.getCPtr(value), value);
  }

  public static Value getProperty(String name, String key) {
    long cPtr = yarpJNI.NetworkBase_getProperty(name, key);
    return (cPtr == 0) ? null : new Value(cPtr, false);
  }

  public static ConstString getNameServerName() {
    return new ConstString(yarpJNI.NetworkBase_getNameServerName(), true);
  }

  public static Contact getNameServerContact() {
    return new Contact(yarpJNI.NetworkBase_getNameServerContact(), true);
  }

  public static boolean setNameServerName(String name) {
    return yarpJNI.NetworkBase_setNameServerName(name);
  }

  public static boolean setLocalMode(boolean flag) {
    return yarpJNI.NetworkBase_setLocalMode(flag);
  }

  public static boolean getLocalMode() {
    return yarpJNI.NetworkBase_getLocalMode();
  }

  public static ConstString readString(SWIGTYPE_p_bool eof) {
    return new ConstString(yarpJNI.NetworkBase_readString__SWIG_0(SWIGTYPE_p_bool.getCPtr(eof)), true);
  }

  public static ConstString readString() {
    return new ConstString(yarpJNI.NetworkBase_readString__SWIG_1(), true);
  }

  public static boolean write(Contact contact, PortWriter cmd, PortReader reply, boolean admin, boolean quiet, double timeout) {
    return yarpJNI.NetworkBase_write__SWIG_0(Contact.getCPtr(contact), contact, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply, admin, quiet, timeout);
  }

  public static boolean write(Contact contact, PortWriter cmd, PortReader reply, boolean admin, boolean quiet) {
    return yarpJNI.NetworkBase_write__SWIG_1(Contact.getCPtr(contact), contact, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply, admin, quiet);
  }

  public static boolean write(Contact contact, PortWriter cmd, PortReader reply, boolean admin) {
    return yarpJNI.NetworkBase_write__SWIG_2(Contact.getCPtr(contact), contact, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply, admin);
  }

  public static boolean write(Contact contact, PortWriter cmd, PortReader reply) {
    return yarpJNI.NetworkBase_write__SWIG_3(Contact.getCPtr(contact), contact, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply);
  }

  public static boolean write(Contact contact, PortWriter cmd, PortReader reply, ContactStyle style) {
    return yarpJNI.NetworkBase_write__SWIG_4(Contact.getCPtr(contact), contact, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply, ContactStyle.getCPtr(style), style);
  }

  public static boolean writeToNameServer(PortWriter cmd, PortReader reply, ContactStyle style) {
    return yarpJNI.NetworkBase_writeToNameServer(PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply, ContactStyle.getCPtr(style), style);
  }

  public static boolean write(String port_name, PortWriter cmd, PortReader reply) {
    return yarpJNI.NetworkBase_write__SWIG_5(port_name, PortWriter.getCPtr(cmd), cmd, PortReader.getCPtr(reply), reply);
  }

  public static boolean checkNetwork() {
    return yarpJNI.NetworkBase_checkNetwork__SWIG_0();
  }

  public static boolean checkNetwork(double timeout) {
    return yarpJNI.NetworkBase_checkNetwork__SWIG_1(timeout);
  }

  public static boolean initialized() {
    return yarpJNI.NetworkBase_initialized();
  }

  public static void setVerbosity(int verbosity) {
    yarpJNI.NetworkBase_setVerbosity(verbosity);
  }

  public static void queryBypass(SWIGTYPE_p_NameStore store) {
    yarpJNI.NetworkBase_queryBypass(SWIGTYPE_p_NameStore.getCPtr(store));
  }

  public static ConstString getEnvironment(String key, SWIGTYPE_p_bool found) {
    return new ConstString(yarpJNI.NetworkBase_getEnvironment__SWIG_0(key, SWIGTYPE_p_bool.getCPtr(found)), true);
  }

  public static ConstString getEnvironment(String key) {
    return new ConstString(yarpJNI.NetworkBase_getEnvironment__SWIG_1(key), true);
  }

  public static boolean registerCarrier(String name, String dll) {
    return yarpJNI.NetworkBase_registerCarrier(name, dll);
  }

  public static void lock() {
    yarpJNI.NetworkBase_lock();
  }

  public static void unlock() {
    yarpJNI.NetworkBase_unlock();
  }

  public static boolean localNetworkAllocation() {
    return yarpJNI.NetworkBase_localNetworkAllocation();
  }

  public static Contact detectNameServer(boolean useDetectedServer, SWIGTYPE_p_bool scanNeeded, SWIGTYPE_p_bool serverUsed) {
    return new Contact(yarpJNI.NetworkBase_detectNameServer(useDetectedServer, SWIGTYPE_p_bool.getCPtr(scanNeeded), SWIGTYPE_p_bool.getCPtr(serverUsed)), true);
  }

  public static ConstString getConfigFile(String fname) {
    return new ConstString(yarpJNI.NetworkBase_getConfigFile(fname), true);
  }

  public static int getDefaultPortRange() {
    return yarpJNI.NetworkBase_getDefaultPortRange();
  }

  public static boolean write(String port_name, Bottle cmd, Bottle reply) {
    return yarpJNI.NetworkBase_write__SWIG_6(port_name, Bottle.getCPtr(cmd), cmd, Bottle.getCPtr(reply), reply);
  }

  public static boolean write(Contact contact, Bottle cmd, Bottle reply, ContactStyle style) {
    return yarpJNI.NetworkBase_write__SWIG_7(Contact.getCPtr(contact), contact, Bottle.getCPtr(cmd), cmd, Bottle.getCPtr(reply), reply, ContactStyle.getCPtr(style), style);
  }

  public static boolean write(Contact contact, Bottle cmd, Bottle reply, boolean admin, boolean quiet, double timeout) {
    return yarpJNI.NetworkBase_write__SWIG_8(Contact.getCPtr(contact), contact, Bottle.getCPtr(cmd), cmd, Bottle.getCPtr(reply), reply, admin, quiet, timeout);
  }

  public NetworkBase() {
    this(yarpJNI.new_NetworkBase(), true);
  }

}
