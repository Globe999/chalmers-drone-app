package com.dji.GSDemo.GoogleMap;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.secneo.sdk.Helper;

import org.asta.isoObject.CartesianPosition;
import org.asta.isoObject.SpeedType;
import org.asta.isoObject.TrajectoryWaypointVector;
import org.locationtech.proj4j.ProjCoordinate;

public class MApplication extends Application {
    static {
        try {
            System.loadLibrary("isoObject_wrap");
        }catch(Exception e)
        {
            Log.wtf("Error", e);
        }



    }


    private DJIDemoApplication fpvDemoApplication;
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        if (fpvDemoApplication == null) {
            fpvDemoApplication = new DJIDemoApplication();
            fpvDemoApplication.setContext(this);
        }
    }





    @Override
    public void onCreate() {

        super.onCreate();
        // Uncomment following lines to test communication from ISOObject <-> ATOS, see Task class below
        
        //Task droneTask = new Task();
        //droneTask.run();
        
        // Uncomment following line to start connection to DJI drone and ISOObject <-> ATOS.
        fpvDemoApplication.onCreate();

    }
}


/* Testing class to debug communication from ISOObject <-> ATOS */
class Task implements Runnable {
    @Override
    public void run() {
        IsoDrone drone = new IsoDrone("172.20.10.5");
        double test = 0.01;
        String lastDroneState = "";

         while(true) {
            try {
               Thread.sleep(100);
               Log.wtf("Name", drone.getName());
               Log.wtf("State", drone.getCurrentStateName());
               Log.wtf("IPv4", Utils.getIPAddress(true)); // IPv4

                //Log.wtf("Lat: ", String.valueOf(drone.getOrigin().getLatitude_deg()));
                //Log.wtf("Log: ", String.valueOf(drone.getOrigin().getLongitude_deg()));
                //Log.wtf("alt: ", String.valueOf(drone.getOrigin().getAltitude_m()));

                if (drone.getCurrentStateName().equals("Armed") || (drone.getCurrentStateName().equals("Running"))) {

                    CartesianPosition dronePos = new CartesianPosition();
                    SpeedType droneSpeed = new SpeedType();

                    droneSpeed.setIsLateralValid(true);
                    droneSpeed.setIsLongitudinalValid(true);
                    droneSpeed.setLateral_m_s(2);
                    droneSpeed.setLongitudinal_m_s(2);

                    dronePos.setXCoord_m(test);
                    dronePos.setYCoord_m(20);
                    dronePos.setZCoord_m(30);
                    dronePos.setHeading_rad(0);
                    test += 0.1;
                    dronePos.setIsPositionValid(true);
                    dronePos.setIsHeadingValid(true);
                    drone.setPosition(dronePos);
                    drone.setSpeed(droneSpeed);

                    // Debug prints
                    // Log.wtf("TrajName: ", drone.getTrajectoryHeader().getTrajectoryName());

                    // TrajectoryWaypointVector traj =  drone.getTrajectory();

                    // for(int i = 0; i < traj.size(); i++){
                    //      Log.wtf("point " + String.valueOf(i) + " X: ", String.valueOf(traj.get(i).getPos().getXCoord_m()));
                    //      Log.wtf("point " + String.valueOf(i) + " Y: ", String.valueOf(traj.get(i).getPos().getYCoord_m()));
                    // }

                }

                if (drone.getCurrentStateName().equals("Init") && lastDroneState != "Init") {
                    Log.wtf("Error", "Init");

                    lastDroneState = "Init";
                } else if (drone.getCurrentStateName().equals("PreArming") && lastDroneState != "PreArming") {
                    Log.wtf("Error", "PreArming");
                    lastDroneState = "PreArming";

                } else if (drone.getCurrentStateName().equals("Armed") && lastDroneState != "Armed") {
                    TrajectoryWaypointVector traj =  drone.getTrajectory();
                    Log.wtf("traj Size", String.valueOf(traj.size()));
                    double epsilon = 0.001;

                    do{
                        drone.reducePoints(epsilon);
                        epsilon += 0.001;
                    }while (drone.getReducedTraj().size() > 99 && epsilon < 0.06);
                    Log.wtf("newTraj", String.valueOf(drone.getReducedTraj().size()));


                    lastDroneState = "Armed";
                } else if (drone.getCurrentStateName().equals("Disarmed") && lastDroneState != "Disarmed") {

                    Log.wtf("Error", "Disarmed");
                    lastDroneState = "Disarmed";
                } else if (drone.getCurrentStateName().equals("PreRunning") && lastDroneState != "PreRunning") {
                    Log.wtf("Error", "PreRunning");
                    lastDroneState = "PreRunning";
                } else if (drone.getCurrentStateName().equals("Running") && lastDroneState != "Running") {

                    Log.wtf("Error", "Running");
                    lastDroneState = "Running";
                } else if (drone.getCurrentStateName().equals("NormalStop") && lastDroneState != "NormalStop") {
                    Log.wtf("Error", "NormalStop");
                    lastDroneState = "NormalStop";
                } else if (drone.getCurrentStateName().equals("EmergencyStop") && lastDroneState != "EmergencyStop") {
                    Log.wtf("Error", "EmergencyStop");
                    lastDroneState = "EmergencyStop";
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    }
}
