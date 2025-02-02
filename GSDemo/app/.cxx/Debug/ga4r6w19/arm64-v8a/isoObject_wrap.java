/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public class isoObject_wrap implements isoObject_wrapConstants {
  public static SWIGTYPE_p_std__mapT_ISO22133__Events__EventType_std__string_t getDescriptions() {
    long cPtr = isoObject_wrapJNI.descriptions_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_ISO22133__Events__EventType_std__string_t(cPtr, false);
  }

  public static SWIGTYPE_p_std__mapT_ISO22133__ObjectStateID_std__string_t getStateNames() {
    long cPtr = isoObject_wrapJNI.stateNames_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_ISO22133__ObjectStateID_std__string_t(cPtr, false);
  }

  public static boolean LessThan(Transition lhs, Transition rhs) {
    return isoObject_wrapJNI.LessThan(Transition.getCPtr(lhs), lhs, Transition.getCPtr(rhs), rhs);
  }

  public static SWIGTYPE_p_std__setT_ISO22133__Transition_t getLanguage() {
    long cPtr = isoObject_wrapJNI.language_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__setT_ISO22133__Transition_t(cPtr, false);
  }

  public static int encodeMONRMessage(timeval objectTime, CartesianPosition position, SpeedType speed, SWIGTYPE_p_AccelerationType acceleration, short driveDirection, short objectState, short readyToArm, short objectErrorState, int errorCode, String monrDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeMONRMessage(timeval.getCPtr(objectTime), objectTime, CartesianPosition.getCPtr(position), position, SpeedType.getCPtr(speed), speed, SWIGTYPE_p_AccelerationType.getCPtr(acceleration), driveDirection, objectState, readyToArm, objectErrorState, errorCode, monrDataBuffer, bufferLength, debug);
  }

  public static int decodeMONRMessage(String monrDataBuffer, long bufferLength, timeval currentTime, SWIGTYPE_p_unsigned_int objectID, SWIGTYPE_p_ObjectMonitorType MonitorData, char debug) {
    return isoObject_wrapJNI.decodeMONRMessage(monrDataBuffer, bufferLength, timeval.getCPtr(currentTime), currentTime, SWIGTYPE_p_unsigned_int.getCPtr(objectID), SWIGTYPE_p_ObjectMonitorType.getCPtr(MonitorData), debug);
  }

  public static int encodeTRAJMessageHeader(int trajectoryID, TrajectoryInfoType trajectoryInfo, String trajectoryName, long nameLength, long numberOfPointsInTraj, String trajDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeTRAJMessageHeader(trajectoryID, trajectoryInfo.swigValue(), trajectoryName, nameLength, numberOfPointsInTraj, trajDataBuffer, bufferLength, debug);
  }

  public static int encodeTRAJMessagePoint(timeval pointTimeFromStart, CartesianPosition position, SpeedType speed, SWIGTYPE_p_AccelerationType acceleration, float curvature, String trajDataBufferPointer, long remainingBufferLength, char debug) {
    return isoObject_wrapJNI.encodeTRAJMessagePoint(timeval.getCPtr(pointTimeFromStart), pointTimeFromStart, CartesianPosition.getCPtr(position), position, SpeedType.getCPtr(speed), speed, SWIGTYPE_p_AccelerationType.getCPtr(acceleration), curvature, trajDataBufferPointer, remainingBufferLength, debug);
  }

  public static int decodeTRAJMessagePoint(TrajectoryWaypointType wayPoints, String trajDataBuffer, char debug) {
    return isoObject_wrapJNI.decodeTRAJMessagePoint(TrajectoryWaypointType.getCPtr(wayPoints), wayPoints, trajDataBuffer, debug);
  }

  public static int encodeTRAJMessageFooter(String trajDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeTRAJMessageFooter(trajDataBuffer, bufferLength, debug);
  }

  public static int decodeTRAJMessageHeader(TrajectoryHeaderType trajHeader, String trajDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.decodeTRAJMessageHeader(TrajectoryHeaderType.getCPtr(trajHeader), trajHeader, trajDataBuffer, bufferLength, debug);
  }

  public static int encodeSTRTMessage(StartMessageType startData, String strtDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeSTRTMessage(StartMessageType.getCPtr(startData), startData, strtDataBuffer, bufferLength, debug);
  }

  public static int decodeSTRTMessage(String strtDataBuffer, long bufferLength, timeval currentTime, StartMessageType startData, char debug) {
    return isoObject_wrapJNI.decodeSTRTMessage(strtDataBuffer, bufferLength, timeval.getCPtr(currentTime), currentTime, StartMessageType.getCPtr(startData), startData, debug);
  }

  public static int encodeOSEMMessage(ObjectSettingsType objectSettingsData, String osemDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeOSEMMessage(ObjectSettingsType.getCPtr(objectSettingsData), objectSettingsData, osemDataBuffer, bufferLength, debug);
  }

  public static int decodeOSEMMessage(ObjectSettingsType objectSettingsData, String osemDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.decodeOSEMMessage(ObjectSettingsType.getCPtr(objectSettingsData), objectSettingsData, osemDataBuffer, bufferLength, debug);
  }

  public static int encodeOSTMMessage(ObjectCommandType command, String ostmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeOSTMMessage(command.swigValue(), ostmDataBuffer, bufferLength, debug);
  }

  public static int decodeOSTMMessage(String ostmDataBuffer, long bufferLength, SWIGTYPE_p_ObjectCommandType command, char debug) {
    return isoObject_wrapJNI.decodeOSTMMessage(ostmDataBuffer, bufferLength, SWIGTYPE_p_ObjectCommandType.getCPtr(command), debug);
  }

  public static int encodeHEABMessage(timeval heabTime, ControlCenterStatusType status, String heabDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeHEABMessage(timeval.getCPtr(heabTime), heabTime, status.swigValue(), heabDataBuffer, bufferLength, debug);
  }

  public static int decodeHEABMessage(String heabDataBuffer, long bufferLength, timeval currentTime, HeabMessageDataType heabData, char debug) {
    return isoObject_wrapJNI.decodeHEABMessage(heabDataBuffer, bufferLength, timeval.getCPtr(currentTime), currentTime, HeabMessageDataType.getCPtr(heabData), heabData, debug);
  }

  public static int encodeSYPMMessage(timeval synchronizationTime, timeval freezeTime, String sypmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeSYPMMessage(timeval.getCPtr(synchronizationTime), synchronizationTime, timeval.getCPtr(freezeTime), freezeTime, sypmDataBuffer, bufferLength, debug);
  }

  public static int encodeMTSPMessage(timeval estSyncPointTime, String mtspDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeMTSPMessage(timeval.getCPtr(estSyncPointTime), estSyncPointTime, mtspDataBuffer, bufferLength, debug);
  }

  public static int encodeTRCMMessage(SWIGTYPE_p_unsigned_short triggerID, SWIGTYPE_p_TriggerType_t triggerType, SWIGTYPE_p_TriggerTypeParameter_t param1, SWIGTYPE_p_TriggerTypeParameter_t param2, SWIGTYPE_p_TriggerTypeParameter_t param3, String trcmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeTRCMMessage(SWIGTYPE_p_unsigned_short.getCPtr(triggerID), SWIGTYPE_p_TriggerType_t.getCPtr(triggerType), SWIGTYPE_p_TriggerTypeParameter_t.getCPtr(param1), SWIGTYPE_p_TriggerTypeParameter_t.getCPtr(param2), SWIGTYPE_p_TriggerTypeParameter_t.getCPtr(param3), trcmDataBuffer, bufferLength, debug);
  }

  public static int encodeACCMMessage(SWIGTYPE_p_unsigned_short actionID, SWIGTYPE_p_ActionType_t actionType, SWIGTYPE_p_ActionTypeParameter_t param1, SWIGTYPE_p_ActionTypeParameter_t param2, SWIGTYPE_p_ActionTypeParameter_t param3, String accmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeACCMMessage(SWIGTYPE_p_unsigned_short.getCPtr(actionID), SWIGTYPE_p_ActionType_t.getCPtr(actionType), SWIGTYPE_p_ActionTypeParameter_t.getCPtr(param1), SWIGTYPE_p_ActionTypeParameter_t.getCPtr(param2), SWIGTYPE_p_ActionTypeParameter_t.getCPtr(param3), accmDataBuffer, bufferLength, debug);
  }

  public static int encodeEXACMessage(SWIGTYPE_p_unsigned_short actionID, timeval executionTime, String exacDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeEXACMessage(SWIGTYPE_p_unsigned_short.getCPtr(actionID), timeval.getCPtr(executionTime), executionTime, exacDataBuffer, bufferLength, debug);
  }

  public static int encodeRCMMMessage(RemoteControlManoeuvreMessageType rcmmObjectData, String rcmmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeRCMMMessage(RemoteControlManoeuvreMessageType.getCPtr(rcmmObjectData), rcmmObjectData, rcmmDataBuffer, bufferLength, debug);
  }

  public static int decodeRCMMMessage(String rcmmDataBuffer, long bufferLength, RemoteControlManoeuvreMessageType rcmmData, char debug) {
    return isoObject_wrapJNI.decodeRCMMMessage(rcmmDataBuffer, bufferLength, RemoteControlManoeuvreMessageType.getCPtr(rcmmData), rcmmData, debug);
  }

  public static int encodeINSUPMessage(SupervisorCommandType arg0, String insupDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeINSUPMessage(arg0.swigValue(), insupDataBuffer, bufferLength, debug);
  }

  public static int encodeDCTIMessage(DctiMessageDataType dctiData, String dctiDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeDCTIMessage(DctiMessageDataType.getCPtr(dctiData), dctiData, dctiDataBuffer, bufferLength, debug);
  }

  public static ISOMessageReturnValue decodeDCTIMessage(String dctiDataBuffer, long bufferLength, DctiMessageDataType dctiData, char debug) {
    return ISOMessageReturnValue.swigToEnum(isoObject_wrapJNI.decodeDCTIMessage(dctiDataBuffer, bufferLength, DctiMessageDataType.getCPtr(dctiData), dctiData, debug));
  }

  public static ISOMessageID getISOMessageType(String messageData, long length, char debug) {
    return ISOMessageID.swigToEnum(isoObject_wrapJNI.getISOMessageType(messageData, length, debug));
  }

  public static void setISOCRCVerification(byte enabled) {
    isoObject_wrapJNI.setISOCRCVerification(enabled);
  }

  public static void setTransmitterID(long transmitterID) {
    isoObject_wrapJNI.setTransmitterID(transmitterID);
  }

  public static long getTransmitterID() {
    return isoObject_wrapJNI.getTransmitterID();
  }

  public static int encodePODIMessage(PeerObjectInjectionType peerObjectData, String podiDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodePODIMessage(PeerObjectInjectionType.getCPtr(peerObjectData), peerObjectData, podiDataBuffer, bufferLength, debug);
  }

  public static int decodePODIMessage(String podiDataBuffer, long bufferLength, timeval currentTime, PeerObjectInjectionType peerData, char debug) {
    return isoObject_wrapJNI.decodePODIMessage(podiDataBuffer, bufferLength, timeval.getCPtr(currentTime), currentTime, PeerObjectInjectionType.getCPtr(peerData), peerData, debug);
  }

  public static int encodeOPROMessage(ObjectPropertiesType objectPropertiesData, String oproDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeOPROMessage(ObjectPropertiesType.getCPtr(objectPropertiesData), objectPropertiesData, oproDataBuffer, bufferLength, debug);
  }

  public static int decodeOPROMessage(ObjectPropertiesType objectPropertiesData, String oproDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.decodeOPROMessage(ObjectPropertiesType.getCPtr(objectPropertiesData), objectPropertiesData, oproDataBuffer, bufferLength, debug);
  }

  public static int encodeFOPRMessage(ForeignObjectPropertiesType foreignObjectPropertiesData, String foprDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeFOPRMessage(ForeignObjectPropertiesType.getCPtr(foreignObjectPropertiesData), foreignObjectPropertiesData, foprDataBuffer, bufferLength, debug);
  }

  public static int decodeFOPRMessage(ForeignObjectPropertiesType foreignObjectPropertiesData, String foprDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.decodeFOPRMessage(ForeignObjectPropertiesType.getCPtr(foreignObjectPropertiesData), foreignObjectPropertiesData, foprDataBuffer, bufferLength, debug);
  }

  public static int encodeRDCAMessage(RequestControlActionType requestControlActionData, String rdcaDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeRDCAMessage(RequestControlActionType.getCPtr(requestControlActionData), requestControlActionData, rdcaDataBuffer, bufferLength, debug);
  }

  public static int decodeRDCAMessage(String rdcaDataBuffer, RequestControlActionType requestControlActionData, long bufferLength, timeval currentTime, char debug) {
    return isoObject_wrapJNI.decodeRDCAMessage(rdcaDataBuffer, RequestControlActionType.getCPtr(requestControlActionData), requestControlActionData, bufferLength, timeval.getCPtr(currentTime), currentTime, debug);
  }

  public static int encodeGDRMMessage(GdrmMessageDataType gdrmData, String gdrmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeGDRMMessage(GdrmMessageDataType.getCPtr(gdrmData), gdrmData, gdrmDataBuffer, bufferLength, debug);
  }

  public static ISOMessageReturnValue decodeGDRMMessage(String gdrmDataBuffer, long bufferLength, GdrmMessageDataType gdrmData, char debug) {
    return ISOMessageReturnValue.swigToEnum(isoObject_wrapJNI.decodeGDRMMessage(gdrmDataBuffer, bufferLength, GdrmMessageDataType.getCPtr(gdrmData), gdrmData, debug));
  }

  public static int decodeGREMMessage(String gremDataBuffer, long bufferLength, GeneralResponseMessageType gremData, char debug) {
    return isoObject_wrapJNI.decodeGREMMessage(gremDataBuffer, bufferLength, GeneralResponseMessageType.getCPtr(gremData), gremData, debug);
  }

  public static int encodeGREMMessage(GeneralResponseMessageType gremObjectData, String gremDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeGREMMessage(GeneralResponseMessageType.getCPtr(gremObjectData), gremObjectData, gremDataBuffer, bufferLength, debug);
  }

  public static int encodeDCMMMessage(RemoteControlManoeuvreMessageType command, String dcmmDataBuffer, long bufferLength, char debug) {
    return isoObject_wrapJNI.encodeDCMMMessage(RemoteControlManoeuvreMessageType.getCPtr(command), command, dcmmDataBuffer, bufferLength, debug);
  }

  public static int decodeDCMMMessage(String dcmmDataBuffer, long bufferLenght, RemoteControlManoeuvreMessageType dcmmData, char debug) {
    return isoObject_wrapJNI.decodeDCMMMessage(dcmmDataBuffer, bufferLenght, RemoteControlManoeuvreMessageType.getCPtr(dcmmData), dcmmData, debug);
  }

}
