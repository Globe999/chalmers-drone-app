/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_isoObject_wrap_WRAP_H_
#define SWIG_isoObject_wrap_WRAP_H_

class SwigDirector_TestObject : public ISO22133::TestObject, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_TestObject(JNIEnv *jenv, std::string const &listenIP = "");
    virtual ~SwigDirector_TestObject();
    virtual void handleAbort();
    virtual void handleAbortSwigPublic() {
      ISO22133::TestObject::handleAbort();
    }
    virtual int handleVendorSpecificMessage(int const msgType, std::vector< char > const &data);
    virtual int handleVendorSpecificMessageSwigPublic(int const msgType, std::vector< char > const &data) {
      return ISO22133::TestObject::handleVendorSpecificMessage(msgType,data);
    }
    virtual ISO22133::Unknown *createUnknown() const;
    virtual ISO22133::Unknown *createUnknownSwigPublic() const {
      return ISO22133::TestObject::createUnknown();
    }
    virtual ISO22133::Off *createOff() const;
    virtual ISO22133::Off *createOffSwigPublic() const {
      return ISO22133::TestObject::createOff();
    }
    virtual ISO22133::Init *createInit() const;
    virtual ISO22133::Init *createInitSwigPublic() const {
      return ISO22133::TestObject::createInit();
    }
    virtual ISO22133::Armed *createArmed() const;
    virtual ISO22133::Armed *createArmedSwigPublic() const {
      return ISO22133::TestObject::createArmed();
    }
    virtual ISO22133::Disarmed *createDisarmed() const;
    virtual ISO22133::Disarmed *createDisarmedSwigPublic() const {
      return ISO22133::TestObject::createDisarmed();
    }
    virtual ISO22133::Running *createRunning() const;
    virtual ISO22133::Running *createRunningSwigPublic() const {
      return ISO22133::TestObject::createRunning();
    }
    virtual ISO22133::PostRun *createPostRun() const;
    virtual ISO22133::PostRun *createPostRunSwigPublic() const {
      return ISO22133::TestObject::createPostRun();
    }
    virtual ISO22133::RemoteControlled *createRemoteControlled() const;
    virtual ISO22133::RemoteControlled *createRemoteControlledSwigPublic() const {
      return ISO22133::TestObject::createRemoteControlled();
    }
    virtual ISO22133::Aborting *createAborting() const;
    virtual ISO22133::Aborting *createAbortingSwigPublic() const {
      return ISO22133::TestObject::createAborting();
    }
    virtual ISO22133::PreArming *createPreArming() const;
    virtual ISO22133::PreArming *createPreArmingSwigPublic() const {
      return ISO22133::TestObject::createPreArming();
    }
    virtual ISO22133::PreRunning *createPreRunning() const;
    virtual ISO22133::PreRunning *createPreRunningSwigPublic() const {
      return ISO22133::TestObject::createPreRunning();
    }
    virtual void onStateChange();
    virtual void onStateChangeSwigPublic() {
      ISO22133::TestObject::onStateChange();
    }
    virtual void onOSEM(ObjectSettingsType &arg0);
    virtual void onOSEMSwigPublic(ObjectSettingsType &arg0) {
      ISO22133::TestObject::onOSEM(arg0);
    }
    virtual void onHEAB(HeabMessageDataType &arg0);
    virtual void onHEABSwigPublic(HeabMessageDataType &arg0) {
      ISO22133::TestObject::onHEAB(arg0);
    }
    virtual void onTRAJ();
    virtual void onTRAJSwigPublic() {
      ISO22133::TestObject::onTRAJ();
    }
    virtual void onOSTM(ObjectCommandType &arg0);
    virtual void onOSTMSwigPublic(ObjectCommandType &arg0) {
      ISO22133::TestObject::onOSTM(arg0);
    }
    virtual void onSTRT(StartMessageType &arg0);
    virtual void onSTRTSwigPublic(StartMessageType &arg0) {
      ISO22133::TestObject::onSTRT(arg0);
    }
public:
    bool swig_overrides(int n) {
      return (n < 19 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<19> swig_override;
};


#endif