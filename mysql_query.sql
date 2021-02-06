
create database demo3;

-- using database
use demo3;

-- creating table doctor
CREATE TABLE doctor(
doc_id INT PRIMARY KEY,
dept VARCHAR(30),
full_name VARCHAR(20)
);

-- creating table patient
CREATE TABLE patient(
patient_id INT AUTO_INCREMENT PRIMARY KEY,
full_name VARCHAR(20) NOT NULL,
contact decimal(10,0) NOT NULL,
age INT NOT NULL, 
gender VARCHAR(10),
weight INT NOT NULL,
bloodgrp VARCHAR(10) NOT NULL,
address VARCHAR(300) NOT NULL,
disease VARCHAR(200) NOT NULL,
doc_id INT NOT NULL,
FOREIGN KEY(doc_id) REFERENCES doctor(doc_id)
);

-- creating table patient report on doctors page ( no primary key here )
-- ha doctor wala page aahe
CREATE TABLE patient_report(
patient_id INT NOT NULL,
dept VARCHAR(20),
doc_id INT NOT NULL,
full_name VARCHAR(20) NOT NULL,
symptoms VARCHAR(30),
diagnosis VARCHAR(30),
medicine VARCHAR(30),
wardreq varchar(10),
typeward varchar(20),
FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
FOREIGN KEY(doc_id) REFERENCES doctor(doc_id)
);

-- creating table lab report
CREATE TABLE labreport(
patient_id INT NOT NULL,
lab_report_no INT AUTO_INCREMENT PRIMARY KEY,  
lab_id INT NOT NULL,
doc_id INT NOT NULL,
category VARCHAR(20) NOT NULL,
amount INT NOT NULL,
descriptionreport VARCHAR(30),
lab_date DATE NOT NULL,
FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
FOREIGN KEY(doc_id) REFERENCES doctor(doc_id)
);

-- creating table impatient ( ikede room_no primary  key dilay ) 
create table impatient(
patient_id INT NOT NULL,
lab_report_no INT NOT NULL,
date_of_admission DATE NOT NULL,
date_of_discharge DATE,
room_no INT PRIMARY KEY,
reason_for_admit varchar(30),
FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
FOREIGN KEY(lab_report_no) REFERENCES labreport(lab_report_no)
);

-- creating table room
create table room(
patient_id INT NOT NULL,
patient_status VARCHAR(20),
room_no INT NOT NULL,
room_type VARCHAR(10),
FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
FOREIGN KEY(room_no) REFERENCES impatient(room_no)
);

-- IGNORE THIS
-- creating table outpatient ( no primary key here )
-- create table outpatient(
-- patient_id INT NOT NULL,
-- lab_report_no INT NOT NULL,
-- lab_date DATE,
-- FOREIGN KEY(patient_id) REFERENCES patient(patient_id),
-- FOREIGN KEY(lab_report_no) REFERENCES labreport(lab_report_no)
-- );


-- creating table bill
create table bill(
patient_id INT NOT NULL,
bill_no INT AUTO_INCREMENT PRIMARY KEY,
patient_type VARCHAR(20),
doctor_charge INT,
medicine_charge INT,
labreq VARCHAR(10),
lab_charge INT,
admitreq varchar(10),
no_of_days INT,
room_charge INT,
nursing_charge INT,
operationcharge INT,
total_bill INT,
FOREIGN KEY(patient_id) REFERENCES patient(patient_id)
);


insert into doctor values('1','eye','mayur pingale');

select *from patient;
select *from patient_report;
select *from labreport;
select *from impatient;
select *from room;
select *from bill;


