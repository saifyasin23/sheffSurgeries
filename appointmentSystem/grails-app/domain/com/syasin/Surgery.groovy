package com.syasin

class Surgery {

String name

String address

String postcode

String telephone

int numberOfPatients

String description

String openingTime

static hasMany=[doctors:Doctor,receptionists:Receptionist,nurses:Nurse, patients:Patient]

static belongsTo=[patients:Patient]

String toString()

{

return name

}

    static constraints = {

name nullable:false, blank:false;

address nullable:false, blank:false;

postcode nullable:false, blank:false;

telephone nullable:false, blank:false;

numberOfPatients nullable:false, blank:false, min:1, max:50;

description nullable:false, blank:false, maxSize:5000, widget:'textarea'

openingTime nullable:false, blank:false;

    }
}
