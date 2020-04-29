package com.syasin

class Doctor {

String fullName

String qualification

String position

String doctorEmail

String doctorUsername

String doctorPassword

String doctorOffice

String doctorPhone

String bio

Surgery surgery;

static hasMany=[prescriptions:Prescription, nurses:Nurse, patients:Patient, appointments:Appointment]

static belongsTo=[nurses:Nurse]

String toString()

{

return fullName

}

    static constraints = {

fullName nullable:false, blank:false;

qualification nullable:false, blank:false;

position nullable:false, blank:false;

doctorEmail nullable:false, blank:false, email:true;

doctorUsername nullable:false, blank:false, unique:true;

doctorPassword nullable:false, blank:false;

doctorOffice nullable:false, blank:false;

doctorPhone nullable:false, blank:false;

bio nullable:false, blank:false, maxSize:5000, widget:'textarea';

    }
}
