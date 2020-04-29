package com.syasin

class BootStrap {

  def init = { servletContext ->

//Surgery

def surgery1 = new Surgery (
name: 'City Health Centre', 
address: '21 Marble Streets, Sheffield', 
postcode: 'S11 5TY', 
telephone: '0114 555 555', 
numberOfPatients: '50', 
description: 'Lorem Ipsum', 
openingTime: '09:00-17:00hrs').save()

def surgery2 = new Surgery (
name: 'Northern General Hospital', 
address: 'Herries Road, Sheffield', 
postcode: 'S5 7AU', 
telephone: '0114 243 4343', 
numberOfPatients: '40', 
description: 'Lorem Ipsum', 
openingTime: '24hrs').save()

def surgery3 = new Surgery (
name: 'Royal Hallamshire Hosptial', 
address: 'Glossop Road, Sheffield', 
postcode: 'S10 2JF', 
telephone: '0114 271 1900', 
numberOfPatients: '45', 
description: 'Lorem Ipsum', 
openingTime: '24hrs').save()

//Doctors

def doctor1 = new Doctor ( 
fullName: 'Dr Sarah MacDonald',
qualification: 'MBChB(Sheffield)',
position: 'GP, Surgeon',	
doctorEmail: 's.macdonald@myemail.com',
doctorUsername: 'SarahM',
doctorPassword:'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'Lorem Ispsum',
surgery: surgery1 ).save()

def doctor2 = new Doctor ( 
fullName: 'Dr Saif Yasin',
qualification: 'MBChB(Sheffield)',
position: 'Surgeon',	
doctorEmail: 's.yasin@myemail.com',
doctorUsername: 'SaifY',
doctorPassword:'secret222',
doctorOffice: 'D-9887',
doctorPhone: '01111778',
bio: 'Lorem Ispsum',
surgery: surgery2 ).save()

def doctor3 = new Doctor ( 
fullName: 'Dr Tom Bob',
qualification: 'MBChB(Sheffield)',
position: 'GP',	
doctorEmail: 't.bob@myemail.com',
doctorUsername: 'TomB',
doctorPassword:'secret222',
doctorOffice: 'D-9886',
doctorPhone: '01111779',
bio: 'Lorem Ispsum',
surgery: surgery3 ).save()

//Patients

def patient1 = new Patient ( 
patientName: 'Tom Rivers',     
patientAddress: '2 One Way Street, Eckington',      
patientResidence: 'Sheffield',    
patientDob: new Date('20/09/1998'),          
patientID: 'E25555',          
dateRegistered: new Date('26/02/2018'),      
patientPhone: '0114 222 4444').save()

def patient2 = new Patient ( 
patientName: 'James Mac',     
patientAddress: 'Handsworth Road, Sheffield',      
patientResidence: 'Sheffield',    
patientDob: new Date('24/01/1999'),          
patientID: 'E25554',          
dateRegistered: new Date('25/10/2018'),      
patientPhone: '07445510258').save()

def patient3 = new Patient ( 
patientName: 'Mac Smedley',     
patientAddress: 'Manor Top, Sheffield',      
patientResidence: 'Sheffield',    
patientDob: new Date('26/04/2000'),          
patientID: 'E25553',          
dateRegistered: new Date('10/10/2018'),      
patientPhone: '0114 261 8765').save()

//Receptionists

def receptionist1 = new Receptionist ( 
recepName: 'Rob Kingston',  
recepEmail: 'r.kingston@email.com',     
recepUsername: 'rking',
recepPassword: 'secret2019',  
recepPhone: '0114 222 4445',
surgery: surgery1 ).save()

def receptionist2 = new Receptionist ( 
recepName: 'Celia Mae',  
recepEmail: 'c.mae@email.com',     
recepUsername: 'cmae', 
recepPassword: 'secret2019',  
recepPhone: '0114 222 4445',
surgery: surgery2 ).save()

def receptionist3 = new Receptionist ( 
recepName: 'Roz Raz',  
recepEmail: 'r.roz@email.com',     
recepUsername: 'rroz', 
recepPassword: 'secret2019',  
recepPhone: '0114 222 4445',
surgery: surgery3 ).save()

//Nurse

def nurse1 = new Nurse ( 
nurseName: 'Susan Peters',  
qualifications: 'Registered General Nurse', 
nurseEmail: 's.peters@myemail.com',     
nurseOffice: 'B-455',    
nursePhone: '0114 222 4433',
surgery: surgery1 ).save()

def nurse2 = new Nurse ( 
nurseName: 'Black Widow',  
qualifications: 'Registered Head Nurse', 
nurseEmail: 'b.widow@myemail.com',     
nurseOffice: 'B-453',    
nursePhone: '0114 222 4433',
surgery: surgery2 ).save()

def nurse3 = new Nurse ( 
nurseName: 'Tony Stark',  
qualifications: 'Registered Head Nurse', 
nurseEmail: 't.stark@myemail.com',     
nurseOffice: 'B-457',    
nursePhone: '0114 222 4433',
surgery: surgery3 ).save()

//Appointments

def appointment1 = new Appointment ( 
appDate: new Date('25/03/2019'),     
appTime: '9:00',      
appDuration: '45',  
roomNumber: '1500',
patient: patient1,
doctor: doctor1, 
surgery: surgery1).save()

def appointment2 = new Appointment ( 
appDate: new Date('31/03/2019'),     
appTime: '16:00',      
appDuration: '30',  
roomNumber: '1111',
patient: patient2,
doctor: doctor2, 
surgery: surgery2).save()

def appointment3 = new Appointment ( 
appDate: new Date('04/04/2019'),     
appTime: '15:00',      
appDuration: '60',  
roomNumber: '3355',
patient: patient3,
doctor: doctor3, 
surgery: surgery3).save()

//Prescription

def prescription1 = new Prescription ( 
pharmacyName: 'City Centre Pharmacy',         
prescripNumber: '56788',           
medicine: 'Paracetomol',                 
totalCost: '5.90',                
dateIssued: new Date('25/05/2019'),
patientPaying: "Yes",
doctor: doctor1, 
patient: patient1).save()

def prescription2 = new Prescription ( 
pharmacyName: 'City Centre Pharmacy',         
prescripNumber: '56780',           
medicine: 'Ibuprofen',                 
totalCost: '6.55',                
dateIssued: new Date('20/05/2019'),
patientPaying: "No",
doctor: doctor2, 
patient: patient2).save()

def prescription3 = new Prescription ( 
pharmacyName: 'City Centre Pharmacy',         
prescripNumber: '56785',           
medicine: 'Co codamol',                 
totalCost: '9.99',                
dateIssued: new Date('23/05/2019'),
patientPaying: "Yes",
doctor: doctor3, 
patient: patient3).save()

    }
    def destroy = {
    }
}
