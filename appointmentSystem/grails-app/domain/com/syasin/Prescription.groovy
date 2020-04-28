package com.syasin

class Prescription {

String pharmacyName

String prescripNumber

String medicine

BigDecimal totalCost

Date dateIssued

String patientPaying

    static constraints = {

pharmacyName nullable:false, blank:false;

prescripNumber nullable:false, blank:false;

medicine nullable:false, blank:false;

totalCost nullable:false, blank:false;

dateIssued nullable:false, blank:false;

patientPaying nullable:false, blank:false, inList:["Yes", "No"]

    }
}
