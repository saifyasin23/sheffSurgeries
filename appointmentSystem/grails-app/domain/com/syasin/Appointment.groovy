package com.syasin

class Appointment {

Date appDate

String appTime

String appDuration

String roomNumber

    static constraints = {

appDate nullable:false, blank:false;

appTime nullable:false, blank:false;

appDuration nullable:false, blank:false, inList:["30", "45", "60"];

roomNumber nullable:false, blank:false;

}

}
